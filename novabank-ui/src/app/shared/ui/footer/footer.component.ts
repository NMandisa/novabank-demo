import { Component, OnInit } from '@angular/core';
import { FooterSection } from '../../../models/cms/footer-section.model';
import { FooterService } from '../../../services/cms/footer.service';
import { ErrorDetails } from '../../../models/error-details.model';
import { HttpErrorResponse } from '@angular/common/http';
import { ErrorHandlerService } from '../../../services/error-handler.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.scss'],
})
export class FooterComponent implements OnInit {
  footerSections: FooterSection[] = []; // Array to hold footer sections
  errorDetails: ErrorDetails | null = null; // Holds detailed error information

  constructor(private footerService: FooterService, private errorHandler: ErrorHandlerService) { }

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
        //this.handleError(error); // Delegate error handling to a dedicated method
         // Handle errors using the ErrorDetails model
        this.errorDetails = this.errorHandler.handleError(error, 'Failed to load footer sections. Please try again later.');
      },
    });
  }
}
