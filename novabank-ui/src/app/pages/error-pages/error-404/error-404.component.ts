import { Component } from '@angular/core';
import { HeaderComponent } from "../../../shared/ui/header/header.component";
import { FooterComponent } from "../../../shared/ui/footer/footer.component";

@Component({
  selector: 'app-error-404',
  imports: [HeaderComponent, FooterComponent],
  templateUrl: './error-404.component.html',
  styleUrl: './error-404.component.scss'
})
export class Error404Component {

}
