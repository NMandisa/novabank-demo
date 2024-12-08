import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter,TitleStrategy } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import {PageTitleStrategy} from "./shared/page-title-strategy/page.title.strategy";
import {provideHttpClient, withFetch} from "@angular/common/http";

export const appConfig: ApplicationConfig = {
  providers: [
    provideZoneChangeDetection({ eventCoalescing: true }), // Enable efficient change detection
    provideClientHydration(), // Ensure client-side app hydration after SSR (if applicable)
    provideRouter(routes), // Provide router configuration
    provideAnimationsAsync(), // Defer animations loading for better performance
    { provide: TitleStrategy, useClass: PageTitleStrategy }, // Use custom page title strategy
    provideHttpClient(withFetch()) // Use fetch-based HttpClient for better performance
  ]
};

