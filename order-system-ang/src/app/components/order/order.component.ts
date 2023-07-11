import { Component, OnInit } from '@angular/core';
import { Router } from "@angular/router";
import {FormsModule} from "@angular/forms";

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  // styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {

  constructor(private router: Router) { }

  ngOnInit(): void {
  }

  addOrder(): void {
    this.router.navigate(['/orders']);
  }
}
