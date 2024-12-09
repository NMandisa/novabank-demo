import { Component} from '@angular/core';
import { ThemeService } from '../../services/theme.service'; // Assuming you have a ThemeService to manage 
import {TemporaryBannerComponent} from './../../shared/ui/temporary-banner/temporary-banner.component'
import { AnnouncementBannerComponent } from '../../shared/ui/announcement-banner/announcement-banner.component';
import { FeaturesSectionComponent } from "../../shared/ui/features-section/features-section.component";
import { TestimonialsSectionComponent } from "../../shared/ui/testimonials-section/testimonials-section.component";
import { CtaSectionComponent } from "../../shared/ui/cta-section/cta-section.component";
import { FooterComponent } from "../../shared/ui/footer/footer.component";
import { HeaderComponent } from "../../shared/ui/header/header.component";
import { HeroSectionComponent } from "../../shared/ui/hero-section/hero-section.component";

@Component({
  selector: 'app-home-page',
  imports: [TemporaryBannerComponent,
    AnnouncementBannerComponent,
    FeaturesSectionComponent,
    TestimonialsSectionComponent, CtaSectionComponent, FooterComponent, HeaderComponent, HeroSectionComponent],
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent{
  currentTheme: string = 'light';  // Default theme

  constructor(private themeService: ThemeService) {}

  ngOnInit(): void {
    // Set the default theme to light on component initialization
    this.setInitialTheme();
  }

  // Set the initial theme (light) on page load
  setInitialTheme(): void {
    this.changeTheme('light');
  }

  // Common method to change the theme and update the current theme state
  changeTheme(theme: string): void {
    this.themeService.changeTheme(theme);
    this.currentTheme = theme;
  }
  
  // Methods for specific themes
  switchToLightTheme(): void {
    this.changeTheme('light');
  }

  switchToDarkTheme(): void {
    this.changeTheme('dark');
  }

  switchToXmasTheme(): void {
    this.changeTheme('xmas');
  }
}
