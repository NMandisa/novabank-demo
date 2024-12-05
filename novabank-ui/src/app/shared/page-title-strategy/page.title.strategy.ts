import {Injectable} from "@angular/core";
import {provideRouter, RouterStateSnapshot, TitleStrategy} from "@angular/router";
import {Title} from "@angular/platform-browser";
import {routes} from "../../app.routes";

@Injectable({providedIn: 'root'})
export class PageTitleStrategy extends TitleStrategy {
  constructor(private readonly title: Title) {
    super();
  }
  override updateTitle(routerState: RouterStateSnapshot) {
    const title = this.buildTitle(routerState);
    console.log(`Updating title to: NovaBank | ${title}`); // Debug log
    if (title !== undefined) {
      this.title.setTitle(`NovaBank | ${title}`);
    }
  }
  
}
provideRouter(routes);