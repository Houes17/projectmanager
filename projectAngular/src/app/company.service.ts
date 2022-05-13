import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CompanyService {

  
  constructor(private http: HttpClient) { }
  private baseUrl = 'https://localhost:8080/company';


  getCompanyList(): Observable<any> {
    return this.http.get('http://localhost:8080/company/companiesList');
  }

  updateCompany(id: number, value: any): Observable<Object> {
    return this.http.put(`${this.baseUrl}/${id}`, value);
  }

  

}
