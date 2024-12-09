export class ErrorDetails {
    message?: string;       // User-friendly message to display
    statusCode?: number;   // HTTP status code, if applicable
    details?: string;      // Additional details or context (e.g., server response)
    timestamp?: Date;      // When the error occurred
  }

  