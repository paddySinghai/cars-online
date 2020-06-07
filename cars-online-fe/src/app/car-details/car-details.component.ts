import { Component, Inject, OnInit } from '@angular/core';
import { MAT_DIALOG_DATA} from '@angular/material/dialog';
import { Router } from '@angular/router';

export interface Car {
  id: Object;
  make: string;
  model: string ;
  date_added: Date;
  warehouse: Object;
  licensed: boolean;
  price: Number;
}
@Component({
  selector: 'app-car-details',
  templateUrl: './car-details.component.html',
  styleUrls: ['./car-details.component.css']
})
export class CarDetailsComponent{
  carsList =[];
  constructor(@Inject (MAT_DIALOG_DATA) public data: Car,private router: Router) {}
   model: Car=this.data;

   addTocart(carObj:Car) :void {
    this.carsList.push(carObj);
    this.router.navigate(['./checkout'], {state: {data: this.carsList}});
 
   }

}
