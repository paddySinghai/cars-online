import { Component, Inject, OnInit } from '@angular/core';
import {MatDialog, MAT_DIALOG_DATA} from '@angular/material/dialog';
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
  constructor(@Inject (MAT_DIALOG_DATA) public data: Car) {}
   model: Car=this.data;
}
