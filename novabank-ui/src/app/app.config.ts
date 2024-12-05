import { ApplicationConfig, provideZoneChangeDetection } from '@angular/core';
import { provideRouter,TitleStrategy } from '@angular/router';

import { routes } from './app.routes';
import { provideClientHydration } from '@angular/platform-browser';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import {PageTitleStrategy} from "./shared/page-title-strategy/page.title.strategy";
import {provideHttpClient, withFetch} from "@angular/common/http";

export const appConfig: ApplicationConfig = {
  providers: [provideZoneChangeDetection({ eventCoalescing: true }), provideClientHydration(), provideRouter(routes), provideAnimationsAsync(),{provide: TitleStrategy, useClass: PageTitleStrategy},provideHttpClient(withFetch())]
};
