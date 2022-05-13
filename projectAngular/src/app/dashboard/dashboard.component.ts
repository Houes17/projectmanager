import { Component } from '@angular/core';
import  { AuthenticationService } from '../service/authentication.service';
@Component({
  selector: 'cf-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.scss']
})
export class DashboardComponent {
  
  constructor( public loginService : AuthenticationService) { }

  ngOnInit() {
    
  }

      
}
