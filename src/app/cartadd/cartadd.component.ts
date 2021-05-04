import { Component, OnInit } from '@angular/core';
import {DataService} from "../services/data.service"


@Component({
  selector: 'app-cartadd',
  templateUrl: './cartadd.component.html',
  styleUrls: ['./cartadd.component.css']
})
export class CartaddComponent implements OnInit {
  products;
  constructor(private dataService: DataService) { }

  ngOnInit(): void {
  this.dataService
    .getProducts()
   .subscribe(x=>this.products=x.data);
  }

}
