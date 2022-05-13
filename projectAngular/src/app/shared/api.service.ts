import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { map } from 'rxjs/operators';
import { identifierName } from '@angular/compiler';
@Injectable({
  providedIn: 'root'
})
export class ApiService {

  constructor(private _http:HttpClient) {
   }
   postProject(data:any){
    return this._http.post<any>("http://localhost:3000/posts",data).pipe(map((res:any)=>{
      return res;
    }))
   }
   //Get ProjectManager data using Get Method
   getProject(){
    return this._http.get<any>("http://localhost:3000/posts").pipe(map((res:any)=>{
      return res;
    }))
   }


   updateProject(data:any, id_project:number){
     return this._http.put<any>("http://localhost:3000/posts",+id_project,data ).pipe(map((res:any)=>{
       return res;
     }))
   }
}
