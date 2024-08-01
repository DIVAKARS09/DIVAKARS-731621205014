import { Component } from '@angular/core';
import { Employee } from './model/Employee';
import { EmployeeService } from './employee.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  employee:Employee;


  constructor(private ser:EmployeeService) {
  this.employee = new Employee();
  }
  insertEmployee (data: any) {
  this.employee.empId = data.empId;
  this.employee.empName = data. empName;
  this.employee.empSalary = data.empSalary;
  alert(data.empId+" "+ data.empName+" "+data.empSalary);
  //this.result = this. employeeService. insertEmployee (this. employee);
  }
}
