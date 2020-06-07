import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';

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
  selector: 'app-checkout-bucket',
  templateUrl: './checkout-bucket.component.html',
  styleUrls: ['./checkout-bucket.component.css']
})
export class CheckoutBucketComponent implements OnInit {
  
  shoppingList: any;
  dataSource = new MatTableDataSource<Car>(this.shoppingList);
  sum:Number=0;
  displayedColumns: string[] = ['item','price'];

  constructor() { }

  ngOnInit(): void {
    this.shoppingList=history.state.data;
    console.log(this.shoppingList);
    this.shoppingList.forEach(element => {
      this.sum+=element.price;
    });
    this.dataSource=new MatTableDataSource<Car>(this.shoppingList);
  
   }

}
