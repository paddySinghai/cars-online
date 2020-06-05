import { Component, OnInit,ViewChild } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { HttpService } from '../http.service';
import { MatDialog} from '@angular/material/dialog';
import { MatSort } from '@angular/material/sort';
import {CarDetailsComponent} from '../car-details/car-details.component';

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
  selector: 'app-cars-online',
  templateUrl: './cars-online.component.html',
  styleUrls: ['./cars-online.component.css']
})
export class CarsOnlineComponent implements OnInit {
  dataList: any;
  dataSource = new MatTableDataSource<Car>(this.dataList);
  constructor(private _http: HttpService,private _dialouge:MatDialog) {}
  
  displayedColumns: string[] = ['make','model','date_added','licensed','view_details'];

  @ViewChild(MatSort, {static: true}) sort: MatSort;

  ngOnInit(): void {
    this._http.getCarsList().subscribe(dataList => {
      this.dataList = dataList;
      this.dataSource = new MatTableDataSource<Car>(this.dataList.cars);
      this.dataSource.sort = this.sort;
      
    });
  }
  showCarDetails (carObj : Car): void{
    console.log(carObj);
    this._dialouge.open(CarDetailsComponent,{
      data: carObj
    });
  }
}
