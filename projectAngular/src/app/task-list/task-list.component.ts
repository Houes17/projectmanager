import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { TaskService } from '../task.service';
import { Task } from '../task';
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'cf-task-list',
  templateUrl: './task-list.component.html',
  styleUrls: ['./task-list.component.scss']
})
export class TaskListComponent implements OnInit {
  
  tasks: Task[] = []; 
  constructor(private TaskService : TaskService, private router : Router) { }

  ngOnInit(): void {
    this.reloadData();
  }

 
  public reloadData(): void {
    this.TaskService.gettaskList().subscribe(
      (data: Task[]) => {
        this.tasks = data;
        console.log(this.tasks);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  } 

  deleteTask(id : number){
    this.TaskService.deleteTask(id).subscribe(
      (data: Task[]) => {
        this.tasks = data;
        console.log(this.tasks);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
    
   
  }

  taskinfo(id:number){
    this.router.navigate(['info', id]);
  }



}
