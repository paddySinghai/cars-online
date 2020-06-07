import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CarsOnlineComponent } from "./cars-online/cars-online.component";
import { CheckoutBucketComponent } from "./checkout-bucket/checkout-bucket.component"

const routes: Routes = [
  { path: '', component: CarsOnlineComponent },
 { path: 'checkout', component: CheckoutBucketComponent }
]


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
