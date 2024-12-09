import { Injectable } from '@angular/core';
import { LoggerService } from './logging.service';

@Injectable({
  providedIn: 'root',
})
export class ConsoleLogger  implements LoggerService {
  log(message: string, context?: any, details?: any): void {
    console.log(`ConsoleLogger: ${message}`, context, details);
  }
}