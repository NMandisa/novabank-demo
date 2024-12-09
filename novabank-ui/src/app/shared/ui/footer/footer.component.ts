import { Component, OnInit } from '@angular/core';
import { FooterSection } from '../../../models/cms/footer-section.model';
import { FooterService } from '../../../services/cms/footer.service';
import { ErrorDetails } from '../../../models/error-details.model';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss'],
})
export class FooterComponent implements OnInit {
  footerSections: FooterSection[] = []; // Array to hold footer sections
  errorDetails: ErrorDetails | null = null; // Holds detailed error information

  constructor(private footerService: FooterService) { }

  ngOnInit(): void {
    this.loadFooterSections();
  }

  // Fetch footer sections from the service
  private loadFooterSections(): void { // Mark as private since it's only used internally
    this.footerService.getAllFooterSections().subscribe({
      next: (sections: FooterSection[]) => {
        this.footerSections = sections; // Populate footer sections on success
      },
      error: (error: any) => {
        this.handleError(error); // Delegate error handling to a dedicated method
      },
    });
  }

  // Handle errors using the ErrorDetails model
  private handleError(error: HttpErrorResponse): void {
    if (error.error instanceof ErrorEvent) {
      // Client-side error
      console.error('Client-side error:', error.error.message);
    } else {
      // Server-side error
      console.error(`Server-side error: ${error.status} - ${error.message}`);
    }

    this.errorDetails = {
      message: 'Failed to load footer sections. Please try again later.',
      statusCode: error.status,
      details: error.message,
      timestamp: new Date(),
    };
  }
}
