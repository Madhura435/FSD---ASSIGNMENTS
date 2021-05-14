import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import {HttpClientModule} from "@angular/common/http";
import { CreateEmployeeComponent } from './create-employee/create-employee.component';
import {FormsModule,ReactiveFormsModule} from '@angular/forms';
import {FrontRoutingModule} from './front-routing/front-routing.module';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';
import { EmployeeDetailsComponent } from './employee-details/employee-details.component';

@NgModule({
  declarations: [
    AppComponent,
   EmployeeListComponent,
   CreateEmployeeComponent,
   UpdateEmployeeComponent,
   EmployeeDetailsComponent,
   
    
  ],
  imports: [
    BrowserModule,
    FrontRoutingModule,
    HttpClientModule,
    FormsModule,
    ReactiveFormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
