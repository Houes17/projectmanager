import { Component, OnInit } from '@angular/core';
import { Observable } from "rxjs";
import { ProjectData } from '../project';
import { ProjectServiceService } from '../service/project-service.service';
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'cf-project-list',
  templateUrl: './project-list.component.html',
  styleUrls: ['./project-list.component.scss']
})
export class ProjectListComponent implements OnInit {
  projects: ProjectData[] = []; 

  constructor(private projectService: ProjectServiceService,
    private router: Router) {}

    

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.projectService.getProjectList().subscribe(
      (data: ProjectData[]) => {
        this.projects = data;
        console.log(this.projects);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

 /* deleteProject(id: number) {
    this.projectService.deleteProject(id)
      .subscribe(
        (data: ProjectData[]) => {
          this.projects = data;
          console.log(this.projects);
        },
        (error: HttpErrorResponse) => {
          alert(error.message);
        }
      )
  }*/

  employeeDetails(id: number){
    this.router.navigate(['details', id]);
  }
}
