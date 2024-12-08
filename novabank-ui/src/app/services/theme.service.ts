import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ThemeService {

  constructor() {}

  // Change theme dynamically by setting data-theme attribute
  changeTheme(theme: string): void {
    const htmlTag = document.documentElement;  // You can use `document.body` if preferred
    htmlTag.setAttribute('data-theme', theme);  // Set the data-theme attribute on <html> or <body>
  }
}
