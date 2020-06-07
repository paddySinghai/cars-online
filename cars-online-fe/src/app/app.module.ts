import { NgModule} from '@angular/core';
import { AppRoutingModule} from './app-routing.module';
import { AppComponent } from './app.component';
import { CarsOnlineComponent } from './cars-online/cars-online.component';
import { MatToolbarModule} from '@angular/material/toolbar';
import { MatTableModule } from '@angular/material/table';
import { MatCardModule } from '@angular/material/card';
import { HttpClientModule } from '@angular/common/http';
import { CarDetailsComponent } from './car-details/car-details.component';
import { MatDialogModule} from '@angular/material/dialog';
import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {MatListModule} from '@angular/material/list';
import { YesNoPipe } from './yes-no.pipe';
import { CheckoutBucketComponent } from './checkout-bucket/checkout-bucket.component';

@NgModule
({
  declarations: [
    AppComponent,
    CarsOnlineComponent,
    CarDetailsComponent,
    YesNoPipe,
    CheckoutBucketComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    MatToolbarModule,
    MatTableModule,
    HttpClientModule,
    MatCardModule,
    BrowserAnimationsModule,
    MatDialogModule,
    MatListModule,
  ],
  exports:[],
  providers: [],
  bootstrap: [AppComponent],
  entryComponents:[CarDetailsComponent],
  
})
export class AppModule { 
  
}
