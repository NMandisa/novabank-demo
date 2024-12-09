import { Injectable } from '@angular/core';
@Injectable({
    providedIn: 'root'
  })
  export class NotificationService {
    error(message: string): void {
      // Implementation to show error notification
      console.error(`NotificationService: ${message}`);
    }
  }
  