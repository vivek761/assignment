import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl, Validators, FormBuilder } from '@angular/forms';
@Component({
  selector: 'app-item',
  templateUrl: './item.component.html',
  styleUrls: ['./item.component.css']
})
export class ItemComponent implements OnInit {
  contactform: FormGroup;
  userlist: any;
  tprice: any;
  total:number;

  constructor() {
    this.total=0;
    this.userlist = [];
    this.contactform = new FormGroup({
      itemname: new FormControl("", [Validators.required, Validators.minLength(2)]),
      price: new FormControl("", [Validators.required, Validators.min(1)]),
      quantity: new FormControl("", [Validators.required, Validators.min(1)]),
      discount: new FormControl("", [Validators.required, Validators.min(1)]),
      tprice: new FormControl(""),
    })
  }
  public additem(): void {
    this.contactform.value.tprice = (this.contactform.value.price * this.contactform.value.quantity) * ((100 - this.contactform.value.discount) / 100);
    this.userlist.push(this.contactform.value);

    this.contactform.reset();
  }






  totalprice():any {
    console.log(this.userlist);
    var add: any = 0;
    for (let j = 0; j < this.userlist.length; j++) {
      add +=this.userlist[j].tprice;

    }
    this.total=add;
    console.log(add,typeof add)
    return add;
    
  }
  
  ngOnInit(): void {
  }
  onSubmit(): void {}
}
