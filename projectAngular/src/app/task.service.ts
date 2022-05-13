import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Task } from './task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {


  
  constructor(private http: HttpClient) {

   }
   private baseUrl = 'http://localhost:8080/task';


   getTask(id: number): Observable<any> {
    return this.http.get(`${this.baseUrl}/${id}`);
  }

  addTask(task: Object): Observable<Object> {
    return this.http.post('http://localhost:8080/task/addTask', task);
  }

  updateTask(id: number, value: any): Observable<Object> {
    return this.http.put(`http://localhost:8080/task/updateTask/${id}`, value);
  }

  deleteTask(id: number | undefined): Observable<any> {
    return this.http.delete(`http://localhost:8080/task/deleteTask/${id}`, { responseType: 'text' });
  }

  gettaskList(): Observable<Task[]> {
    return this.http.get<Task[]>('http://localhost:8080/task/tasksList');
  }
}



