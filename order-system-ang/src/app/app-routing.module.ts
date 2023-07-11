import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {OrdersComponent} from "./components/orders/orders.component";
import {OrderComponent} from "./components/order/order.component";

const routes: Routes = [
  {path: '', component: OrdersComponent},
  {path: 'orders', component: OrdersComponent},
  {path: 'order', component: OrderComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
