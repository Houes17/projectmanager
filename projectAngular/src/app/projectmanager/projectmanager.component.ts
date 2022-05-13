import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { ApiService } from '../shared/api.service';
import { AuthenticationService } from '../service/authentication.service';
import { ProjectData } from '../project';
import { ProjectServiceService } from '../service/project-service.service';
import { HttpErrorResponse } from '@angular/common/http';


@Component({
  selector: 'cf-projectmanager',
  templateUrl: './projectmanager.component.html',
  styleUrls: ['./projectmanager.component.scss']
})
export class ProjectmanagerComponent implements OnInit {

  formValue!:FormGroup
  project :ProjectData = new ProjectData;
  projects: ProjectData[] = []; 
  constructor(private FormBuilder : FormBuilder, private projectService:ProjectServiceService , public loginService : AuthenticationService) { }

  ngOnInit(): void {
   /* this.formValue = this.FormBuilder.group({
      id_project : [''],
      project_name :['']
    })*/
    this.reloadData();
  }
  /*addProject(){
    this.projectModelObject.id_project = this.formValue.value.id_project;
    this.projectModelObject.project_name = this.formValue.value.project_name;

    this.api.postProject(this.projectModelObject).subscribe(res=>{
      console.log(res);
      alert("Projet ajouté avec succès");
    },

    err=>{
      alert("Projet non ajouté")
    })
  }*/

  
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

}
