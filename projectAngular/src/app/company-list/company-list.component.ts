import { Component, OnInit } from '@angular/core';

import { Observable } from "rxjs";
import { CompanyService } from "../company.service";
import { Company } from "../Company";
import { Router } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
@Component({
  selector: 'cf-company-list',
  templateUrl: './company-list.component.html',
  styleUrls: ['./company-list.component.scss']
})
export class CompanyListComponent implements OnInit {

 companies: Company[] = []; 

  constructor(private companyService: CompanyService,
    private router: Router) {}

  ngOnInit() {
    this.reloadData();
  }

  reloadData() {
    this.companyService.getCompanyList().subscribe(
      (data: Company[]) => {
        this.companies = data;
        console.log(this.companies);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }

  /*deleteTask(company: Company) {
    this.companyService.deleteTask(company)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));
  }*/

  CompanyDetails(id: number){
    this.router.navigate(['details', id]);
  }

  
  updateCompany(id: number){
    this.router.navigate(['update-company', id]);
  }
}


