import { Component, OnInit } from '@angular/core';
import { Employee } from '../employee';
import { EmployeeService } from '../employee.service';
import {Router} from '@angular/router'
import {FormGroup, FormBuilder,FormControl,Validators } from '@angular/forms';
@Component({
  selector: 'app-create-employee',
  templateUrl: './create-employee.component.html',
  styleUrls: ['./create-employee.component.css']
})
export class CreateEmployeeComponent implements OnInit {

  employee: Employee=new Employee();

  constructor(private employeeService: EmployeeService,private router:Router,private fb:FormBuilder) { }

  ngOnInit(): void {
  }
  

  saveEmployee()
  {
   this.employeeService.createEmployee(this.employee).subscribe(data =>{
console.log(data);
this.goToEmployeeList();
   },
   error => console.log(error)
   );
  }

  employeeform=this.fb.group
  (
    {
      firstName:['',[Validators.required]]
    }
  )

 
goToEmployeeList()
{
  this.router.navigate(['/employees']);
}

onSubmit(data)
  {
    
console.log(this.employee);
this.saveEmployee();
  }
}
