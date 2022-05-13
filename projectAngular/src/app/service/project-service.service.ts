import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
 import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ProjectServiceService {
  private baseUrl = 'http://localhost:8080/project';

  constructor(private http: HttpClient) { }

   getProjectList(): Observable<any> {
     return this.http.get('http://localhost:8080/project/projectsList');
   }
   getProjectListById (id : number): Observable<any>{
      return this.http.get('http://localhost:8080/project/${id}');
   }

   updateProject(id: number, value: any): Observable<Object> {
     return this.http.put(`${this.baseUrl}/${id}`, value);
   }

   addProject(Project: Object, ): Observable<Object> {
       return this.http.post('http://localhost:8080/project/addProject', Project);
     }
}
