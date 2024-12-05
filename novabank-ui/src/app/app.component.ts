import {Component, model} from '@angular/core';
import { CommonModule } from '@angular/common';
import { PageTitleStrategy } from './shared/page-title-strategy/page.title.strategy'; // Adjust the path as needed
import { RouterOutlet } from '@angular/router';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet,CommonModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  //title = 'novabank-ui';
}
