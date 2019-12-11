import { Component,ViewChild,OnInit } from '@angular/core';
import {NgForm} from '@angular/forms';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title = 'employeeAttendanceFrontEnd';
  @ViewChild('f',{static: false}) signupForm:NgForm;

  ngOnInit(){
    
  }
  processForm(){
    console.log(this.signupForm.value.userData.id);
    console.log(this.signupForm.value.userData.password);
    console.log(this.signupForm.value.userData.userType);
  }
}
