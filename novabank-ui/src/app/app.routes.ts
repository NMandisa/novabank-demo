import {Routes} from '@angular/router';
import {HomePageComponent} from "./pages/home-page/home-page.component";
import { Error404Component } from './pages/error-pages/error-404/error-404.component';
import { Error500Component } from './pages/error-pages/error-500/error-500.component';

export const routes: Routes = [
  { path: '',
    title:'Home',
    component:HomePageComponent},
    { path: '404', component: Error404Component },
    { path: '500', component: Error500Component },
    { path: '**', redirectTo: '/404' },
  
]
