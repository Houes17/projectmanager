import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule } from '@angular/forms';

import { CompanyComponent } from './company/company.component';
import { ProjectmanagerComponent } from './projectmanager/projectmanager.component';
import { LoginComponent } from './login/login.component';
import { SignupComponent } from './signup/signup.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { HeaderComponent } from './header/header.component';
import { AddTaskComponent } from './add-task/add-task.component';
import { TaskInfoComponent } from './task-info/task-info.component';
import { TaskListComponent } from './task-list/task-list.component';
import { CommonModule} from '@angular/common';
import { LogoutComponent } from './logout/logout.component';
import { CompanyListComponent } from './company-list/company-list.component';

import { DeleteCompanyComponent } from './delete-company/delete-company.component';
import { UpdateCompanyComponent } from './update-company/update-company.component';
import { TaskComponent } from './task/task.component';
import { AddProjectComponent } from './add-project/add-project.component';
import { ProjectListComponent } from './project-list/project-list.component'


@NgModule({
  declarations: [
    AppComponent,
    CompanyComponent,
    ProjectmanagerComponent,
    LoginComponent,
    SignupComponent,
    DashboardComponent,
    HeaderComponent,
    AddTaskComponent,
    TaskInfoComponent,
    TaskListComponent,
    LogoutComponent,
    CompanyListComponent,
  
    DeleteCompanyComponent,
    UpdateCompanyComponent,
    TaskComponent,
    AddProjectComponent,
    ProjectListComponent,

  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
    FormsModule,
    CommonModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
