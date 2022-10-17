import { Injectable } from '@angular/core';
import {Order} from "../models/order";

@Injectable({
  providedIn: 'root'
})
export class OrderService {

  constructor() { }

  getOrders(): Order[] {
    return [
      {id: 1, customerName: "Kan", orderDate: new Date("2022-10-09")},
      {id: 2, customerName: "Bamini", orderDate: new Date("2021-10-10")}
    ];
  }
}
