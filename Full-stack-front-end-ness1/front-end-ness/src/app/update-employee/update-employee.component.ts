import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { EmployeeService } from '../employee.service';
import {Router} from '@angular/router'
import { Employee } from '../employee';

@Component({
  selector: 'app-update-employee',
  templateUrl: './update-employee.component.html',
  styleUrls: ['./update-employee.component.css']
})
export class UpdateEmployeeComponent implements OnInit {
id:number;
employee: Employee=new Employee();
  constructor(private employeeservice:EmployeeService,private route:ActivatedRoute,
    private router:Router) { }

  ngOnInit(): void {
    this.id=this.route.snapshot.params['id'];
    this.employeeservice.getEmployeeById(this.id).subscribe(data =>
      {
this.employee=data;
console.log(data);
      },
      error =>console.log(error)
      );
  }

updateEmployee()
{
  this.employeeservice.updateEmployee(this.id,this.employee).subscribe(data =>
    {
console.log(data);
this.goToEmployeeList();

    },
    error =>console.log(error)
    );
}
onSubmit()
{
  console.log(this.employee);
  this.updateEmployee();
}

goToEmployeeList()
{
  this.router.navigate(['employees']);
}

}
