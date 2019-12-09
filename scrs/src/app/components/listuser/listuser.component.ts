import { Component, OnInit } from '@angular/core';
import {UserService} from '../../shared_service/user.service';
import {User} from '../../user';
import {Router} from '@angular/router';
@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {
  private users:User[];

  constructor(private _userService:UserService,private router:Router) { }

  ngOnInit() {
    this._userService.getUsers().subscribe((users)=>{
      this.users=users;
      console.log(users);
    },(error)=>{
      console.log(error);
    })
  }
  deleteUser(user){
    this._userService.deleteUser(user.id).subscribe((data)=>{
      console.log(data);
       this.users.splice(this.users.indexOf(user),1);
    },(error)=>{
      console.log(error);
    });
  }
  updateUser(user){
    this._userService.setter(user);
     this.router.navigate(['/op']);

  }
  newUser(){
    let user=new User();
    this._userService.setter(user);
    this.router.navigate(['/op']);
  }
}
