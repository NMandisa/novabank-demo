import { Injectable } from '@angular/core';
import { TitleStrategy, RouterStateSnapshot } from '@angular/router';
import { Title } from '@angular/platform-browser';

@Injectable({ providedIn: 'root' })
export class PageTitleStrategy extends TitleStrategy {
  constructor(private readonly title: Title) {
    super();
  }

  override updateTitle(routerState: RouterStateSnapshot): void {
    // Use the buildTitle method provided by TitleStrategy to create the default title
    const title = this.buildTitle(routerState);
    console.log(`Updating title to: NovaBank | ${title}`); // Debug log (consider removing for production)

    // Set the page title if it's defined
    if (title !== undefined) {
      this.title.setTitle(`NovaBank | ${title}`);
    }
  }
}
