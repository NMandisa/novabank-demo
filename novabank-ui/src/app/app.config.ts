import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter,TitleStrategy } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import {PageTitleStrategy} from "./shared/page-title-strategy/page.title.strategy";
import {provideHttpClient, withFetch,HTTP_INTERCEPTORS} from "@angular/common/http";
import { HttpErrorInterceptor } from './interceptors/http-error.interceptor';
import {LoggerService} from './services/logging.service'
import { ConsoleLogger } from './services/console-logger.service';

export const appConfig: ApplicationConfig = {
  providers: [
    provideZoneChangeDetection({ eventCoalescing: true }), // Enable efficient change detection
    provideClientHydration(), // Ensure client-side app hydration after SSR (if applicable)
    provideRouter(routes), // Provide router configuration
    provideAnimationsAsync(), // Defer animations loading for better performance
    { provide: TitleStrategy, useClass: PageTitleStrategy }, // Use custom page title strategy
    provideHttpClient(withFetch()), // Use fetch-based HttpClient for better performance
    {
      provide: 
      HTTP_INTERCEPTORS,
      useClass: HttpErrorInterceptor,
      multi: true
    },
    { provide: LoggerService, useClass: ConsoleLogger }, // Add custom providers
  ]
};