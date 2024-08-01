import { Injectable } from '@angular/core';
import { Employee } from './model/Employee';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  insertEmployee(employee:Employee){
    
  }

  constructor(private http:HttpClient) { 
    this.http.post("http://localhost:3004/",Employee).subscribe
  }
  
}
