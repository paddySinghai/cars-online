import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import {MatDialog} from '@angular/material/dialog';
import { HttpService } from '../http.service';
import {Router} from '@angular/router'

export interface Car {
  id: Object;
  make: string;
  model: string ;
  date_added: Date;
}

@Component({
  selector: 'app-cars-online',
  templateUrl: './cars-online.component.html',
  styleUrls: ['./cars-online.component.css']
})

export class CarsOnlineComponent implements OnInit {
  dataList: any;
  dataSource = new MatTableDataSource<Car>(this.dataList);
  constructor(private _http: HttpService,private _router:Router) {}
  
  displayedColumns: string[] = ['make','model','date_added'];

  ngOnInit(): void {
    this._http.getCarsList().subscribe(dataList => {
      this.dataList = dataList;
      this.dataSource = new MatTableDataSource<Car>(this.dataList.cars);
      
    });
  }
}
