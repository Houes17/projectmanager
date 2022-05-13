import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { TaskService } from '../task.service';
import { Task } from '../task';

import { TaskListComponent } from '../task-list/task-list.component';
import { Router, ActivatedRoute } from '@angular/router';

@Component({
  selector: 'cf-task-info',
  templateUrl: './task-info.component.html',
  styleUrls: ['./task-info.component.scss']
})
export class TaskInfoComponent implements OnInit {
  [x: string]: any;

  id!: number;
  task: Task = new Task;

  constructor(private route: ActivatedRoute,private router: Router,
    private taskinfo: TaskInfoComponent ) { }

  ngOnInit(): void {
    this.task = new Task() ,

    this.id = this.route.snapshot.params['id'];
    
    this['TaskService'].getTask(this.id)
      .subscribe((data: Task) => {
        console.log(data)
        this.task = data;
      }, (error: any) => console.log(error));
  }

  list(){
    this.router.navigate(['/task-list']);

  }

}
