import { Injectable } from '@angular/core';
import {Http, Response, Headers,RequestOptions} from '@angular/http';
import { Observable } from 'rxjs/Observable';
import {User} from '../user';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';
import 'rxjs/add/observable/throw';
@Injectable({
  providedIn: 'root'
})
export class UserService {
 private baseUrl:string='http://localhost:8080/api';
 private headers=new Headers({'content-type':'application/json'});
 private options=new RequestOptions({headers:this.headers});
 private user=new User();
 

  constructor(private _http:Http) { }

  getUsers(){
    return this._http.get(this.baseUrl+'/users',this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }


  getUser(id:number){
    return this._http.get(this.baseUrl+'/user'+id,this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  deleteUser(id:number){
    return this._http.delete(this.baseUrl+'/user'+'/'+id,this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  createUser(user:User){
    return this._http.post(this.baseUrl+'/user',JSON.stringify(user),this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  updateUser(user:User){
    return this._http.put(this.baseUrl+'/user',JSON.stringify(user),this.options).map((response:Response)=>response.json()).catch(this.errorHandler);
  }

  errorHandler(error:Response){
              return Observable.throw(error||"Server error");
  }
  setter(user:User)
  {
    this.user=user;
  }
  getter(){
    return this.user;
  }
}
