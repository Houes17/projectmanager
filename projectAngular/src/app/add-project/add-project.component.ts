import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { ProjectServiceService } from '../service/project-service.service';
import { ProjectData } from '../project';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';


@Component({
  selector: 'cf-add-project',
  templateUrl: './add-project.component.html',
  styleUrls: ['./add-project.component.scss']
})
export class AddProjectComponent implements OnInit {
   project: ProjectData = new ProjectData();
    submitted = false;
    projectService !:ProjectServiceService;

    router: any;


  constructor() { }

  ngOnInit(): void {
  }

   newTask(): void {
      this.submitted = false;
      this.project= new ProjectData();
    }

    save() {
      this.projectService
      .addProject(this.project).subscribe(data => {
        console.log(data)
        this.project = new ProjectData();
        this.gotoList();
      },
      error => console.log(error));

    }

    onSubmit() {
      this.submitted = true;
      this.save();
    }

    gotoList() {
        this.router.navigate(['Project']);
      }

}
