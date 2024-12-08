import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { CustomerRequest } from '../models/customer-request.model';

@Injectable({
  providedIn: 'root',
})
export class CustomerService {
  private readonly API_BASE = 'http://localhost:8080/customers';

  constructor(private http: HttpClient) {}

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

  // Get all customers
  //getAllCustomers(): Observable<CustomerRequest[]> {
    //return this.http.get<CustomerRequest[]>(this.API_BASE, this.getHeaderOptions());
  //}

  // Get a customer by ID
  getCustomerById(id: number): Observable<CustomerRequest> {
    return this.http.get<CustomerRequest>(`${this.API_BASE}/${id}`, this.getHeaderOptions());
  }

  // Create a new customer
  createCustomer(customer: CustomerRequest): Observable<CustomerRequest> {
    return this.http.post<CustomerRequest>(this.API_BASE, customer, this.getHeaderOptions());
  }

  // Update a customer
  updateCustomer(id: number, customer: CustomerRequest): Observable<CustomerRequest> {
    return this.http.put<CustomerRequest>(`${this.API_BASE}/${id}`, customer, this.getHeaderOptions());
  }

  // Delete a customer
  //deleteCustomer(id: number): Observable<void> {
    //return this.http.delete<void>(`${this.API_BASE}/${id}`, this.getHeaderOptions());
  //}
}