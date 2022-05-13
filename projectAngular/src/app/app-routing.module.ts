import { NgModule, ɵflushModuleScopingQueueAsMuchAsPossible } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddTaskComponent } from './add-task/add-task.component';
import { CompanyComponent } from './company/company.component';
import { LoginComponent } from './login/login.component';
import { ProjectmanagerComponent } from './projectmanager/projectmanager.component';
import { SignupComponent } from './signup/signup.component';
import { TaskListComponent } from "./task-list/task-list.component";
import { LogoutComponent} from "./logout/logout.component";
import { AuthGaurdService } from './service/auth-gaurd.service';
import { CompanyListComponent } from './company-list/company-list.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { UpdateCompanyComponent } from './update-company/update-company.component';
import { AddProjectComponent } from './add-project/add-project.component';
const routes: Routes = [
  {
    path : '', redirectTo:'Home', pathMatch:'full'
  },
  {
    path : 'login', component:LoginComponent
  },

  { path : 'logout', component : LogoutComponent , canActivate:[AuthGaurdService]} ,

  {
    path : 'signup' , component: SignupComponent
  },

  {
    path : 'Home', component:DashboardComponent
  },

  {
    path : 'Company', component:CompanyComponent
  },

  {
    path : 'Company-List', component:CompanyListComponent
  },


  {path : 'task-list', component: TaskListComponent},

  {path : 'add-task', component: AddTaskComponent},

  {path : 'update-company/:id',component: UpdateCompanyComponent },
  {path : 'Project', component : ProjectmanagerComponent},
  {path : 'add-project' , component : AddProjectComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
