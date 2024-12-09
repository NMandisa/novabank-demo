import { Injectable } from '@angular/core';
import { HttpErrorResponse } from '@angular/common/http';
import { ErrorDetails } from './../models/error-details.model';
import { LoggerService } from './logging.service';
import { NotificationService } from './notification.service';

@Injectable({
  providedIn: 'root',
})
export class ErrorHandlerService {

  constructor(private logger: LoggerService, private notification: NotificationService) {}

  // Method to handle errors and return structured ErrorDetails
  handleError(error: HttpErrorResponse, userMessage: string = 'An unexpected error occurred.'): ErrorDetails {
    let errorDetails = new ErrorDetails();

    const errorContext = {
      url: error.url || 'Unknown URL',
      status: error.status,
      method: error?.statusText || 'Unknown Method',
    };

    if (error.error instanceof ErrorEvent) {
      // Client-side error
      //console.error('Client-side error:', error.error.message);
      this.logger.log('Client-side error:', errorContext, error.error.message);
      errorDetails.message = userMessage;
      errorDetails.details = error.error.message;
    } else {
      // Server-side error
      //console.error(`Server-side error: ${error.status} - ${error.message}`);
      this.logger.log('Server-side error:', errorContext, `${error.status} - ${error.message}`);
      errorDetails.message = userMessage;
      errorDetails.details = error.message;
    }

    errorDetails.statusCode = error.status;
    errorDetails.timestamp = new Date();

    // Notify user
    this.notification.error(errorDetails.message);
    return errorDetails;
  }
}