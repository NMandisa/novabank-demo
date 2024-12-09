export abstract class LoggerService {
  abstract log(message: string, context?: any, details?: any): void;
}
