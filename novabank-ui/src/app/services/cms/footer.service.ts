import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { catchError, Observable, retry, throwError } from 'rxjs';
import { FooterSection } from '../../models/cms/footer-section.model';
import { environment } from '../../../environments/environment'; // Environment-based configuration

@Injectable({
  providedIn: 'root',
})
export class FooterService {
  private readonly API_BASE = `${environment.apiBaseUrl}/footer-section`; // Using environment variable for API URL
  //const token = this.authService.getToken(); // Delegate token management to AuthService
  constructor(private http: HttpClient) { }

  // Get the header options dynamically
  private getHeaderOptions(): { headers: HttpHeaders } {
    const token = localStorage.getItem('authToken'); // Retrieve token from storage
    return {
      headers: new HttpHeaders({
        'Content-Type': 'application/json',
        'Accept': 'application/json',
        Authorization: token ? `Bearer ${token}` : '',
      }),
    };
  }

  // Get all footer sections
  getAllFooterSections(): Observable<FooterSection[]> {
    return this.http
      .get<FooterSection[]>(this.API_BASE, this.getHeaderOptions())
      .pipe(
        retry(2), // Retry the request twice on failure
        catchError(this.handleError.bind(this)) // Use bind to maintain context
      );
  }

  // Get a footer section by ID
  getFooterSectionById(id: number): Observable<FooterSection> {
    return this.http
      .get<FooterSection>(`${this.API_BASE}/${id}`, this.getHeaderOptions())
      .pipe(
        retry(2), // Retry the request twice on failure
        catchError(this.handleError.bind(this))
      );
  }

  // Error handling
  private handleError(error: HttpErrorResponse): Observable<never> {
    // let errorMessage: string;

    // if (error.error instanceof ErrorEvent) {
    //   // Client-side or network error
    //   errorMessage = `Client-side error: ${error.error.message}`;
    // } else {
    //   // Server-side error
    //   errorMessage = `Server-side error: Code ${error.status}, Message: ${error.message}`;
    // }

    // // Log the error (replace console.log with a logging service in production)
    // console.error('Error occurred:', errorMessage);
    // return throwError(() => new Error(errorMessage)); // Return as an Error object

    const errorMessage =
      error.error instanceof ErrorEvent
        ? `Client-side error: ${error.error.message}`
        : `Server-side error: Code ${error.status}, Message: ${error.message}`;

    // Replace with a logging service
    console.error('Error occurred:', errorMessage);
    return throwError(() => new Error(errorMessage));
  }

}