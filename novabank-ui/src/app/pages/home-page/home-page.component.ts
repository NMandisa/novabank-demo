import { Component, OnInit, ViewChild, ElementRef, AfterViewInit } from '@angular/core';
import { ThemeService } from '../../services/theme.service'; // Assuming you have a ThemeService to manage themes

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.scss']
})
export class HomePageComponent implements OnInit, AfterViewInit {
  currentTheme: string = 'light';  // Default theme
  showBanner: boolean = true;  // Flag to control the banner visibility

  // Access the banner element via @ViewChild
  @ViewChild('tempBanner') banner!: ElementRef;

  constructor(private themeService: ThemeService) {}

  ngOnInit(): void {
    // Set the default theme to light on component initialization
    this.setInitialTheme();
  }

  ngAfterViewInit(): void {
    // This lifecycle hook ensures the banner is available after view initialization
    if (this.banner && this.showBanner) {
      this.banner.nativeElement.style.display = 'block'; // Make sure it's visible
    }
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

  // Method to dismiss the banner
  dismissBanner(): void {
    if (this.banner) {
      this.banner.nativeElement.style.display = 'none';
      this.showBanner = false;  // Hide the banner by setting flag to false
    }
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
