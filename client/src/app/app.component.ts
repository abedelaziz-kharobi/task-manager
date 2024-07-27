import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterLink, RouterLinkActive, RouterModule, RouterOutlet } from '@angular/router';
import { AppRoutingModule } from './app-routing.module';
import { MaterialModule } from './demo-material-module';
import { LoginComponent } from './auth/components/login/login.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    CommonModule,
    MaterialModule,
    RouterModule,

  ],

  providers: [],
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'client';
}
function forRoot(arg0: never[]): readonly any[] | import("@angular/core").Type<any> {
  throw new Error('Function not implemented.');
}

