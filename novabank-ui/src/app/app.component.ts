// import {Component} from '@angular/core';
// import { CommonModule } from '@angular/common';
// import { RouterOutlet } from '@angular/router';
// import {ThemeService} from './services/theme.service'


// @Component({
//   selector: 'app-root',
//   imports: [RouterOutlet,CommonModule],
//   templateUrl: './app.component.html',
//   styleUrl: './app.component.scss'
// })
// export class AppComponent {
//   //title = 'novabank-ui';
//   constructor(private themeService: ThemeService) {} 
// }
import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Title } from '@angular/platform-browser';
import { ActivatedRoute, NavigationEnd, Router,RouterOutlet } from '@angular/router';
import { filter } from 'rxjs';
import {ThemeService} from './services/theme.service'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  imports: [RouterOutlet,CommonModule],
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  constructor(
    private router: Router,
    private activatedRoute: ActivatedRoute,
    private titleService: Title
  ) {
    this.router.events.pipe(
      filter(event => event instanceof NavigationEnd)
    ).subscribe(() => {
      const routeData = this.getChildRouteData(this.activatedRoute);
      const title = routeData?.title || 'Default Title';
      this.titleService.setTitle(title);
    });
  }

  private getChildRouteData(route: ActivatedRoute): any {
    let child = route.firstChild;
    while (child) {
      if (child.snapshot.data['title']) {
        return child.snapshot.data;
      }
      child = child.firstChild;
    }
    return route.snapshot.data;
  }
}

