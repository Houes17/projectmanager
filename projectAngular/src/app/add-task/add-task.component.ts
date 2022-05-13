import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { TaskService } from '../task.service';
import { Task } from '../task';
import { Router } from '@angular/router';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'cf-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.scss']
})
export class AddTaskComponent implements OnInit {
  task: Task = new Task();
  tasks: Task[] = []; 
  submitted = false;
 


  constructor(private TaskService : TaskService, 
  private router : Router) { }

  ngOnInit(): void {
  }

  newTask(): void {
    this.submitted = false;
    this.task= new Task();
  }

  save() {
    this.TaskService.addTask(this.task).subscribe(
      (data:any ) => {
        this.tasks = data;
        console.log(this.tasks);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  onSubmit() {
    this.submitted = true;
    this.save();
  }

  gotoList() {
    this.router.navigate(['/tasksList']);
  }
}

