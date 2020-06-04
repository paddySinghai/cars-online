import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarsOnlineComponent } from "./cars-online/cars-online.component";

const routes: Routes = [
  { path: '', component: CarsOnlineComponent }
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
