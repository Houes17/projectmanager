import { Component, OnInit } from '@angular/core';
import { Company } from '../Company';
import { ActivatedRoute, Router } from '@angular/router';
import { CompanyService } from '../company.service';

@Component({
  selector: 'cf-update-company',
  templateUrl: './update-company.component.html',
  styleUrls: ['./update-company.component.scss']
})
export class UpdateCompanyComponent implements OnInit {
  id!: number;
  company!: Company;
  constructor(private route: ActivatedRoute,private router: Router,
    private companyService: CompanyService) { }


  ngOnInit(): void {
    this.company = new Company();

    this.id = this.route.snapshot.params['id'];
    
    this.companyService.getCompanyList()
      .subscribe(data => {
        console.log(data)
        this.company = data;
      }, error => console.log(error));
  }

  updateCompany() {
    this.companyService.updateCompany(this.id, this.company)
      .subscribe(data => {
        console.log(data);
        this.company = new Company();
        this.gotoList();
      }, error => console.log(error));
  }

  onSubmit() {
    this.updateCompany();    
  }

  gotoList() {
    this.router.navigate(['/companiesList']);
  }

}
