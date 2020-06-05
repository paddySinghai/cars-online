import { Component, OnInit } from '@angular/core';
import { MatTableDataSource } from '@angular/material/table';
import { HttpService } from '../http.service';

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
  constructor(private _http: HttpService) {}

  displayedColumns: string[] = ['make','date_added'];

  ngOnInit(): void {
    this._http.getCarsList().subscribe(dataList => {
      this.dataList = dataList;
      this.dataSource = new MatTableDataSource<Car>(this.dataList.carsList);
      
    });
  }

}
