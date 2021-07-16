import { Component, OnInit } from '@angular/core';
export interface IStudent {
  id: number;
 name : String;
 mark : number;
 image:String;
}
@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
student :  IStudent = {
  id: 1,
  name : 'pham thi quynh nhu',
  mark : 0,
  image: '',

}
  constructor() { }

  ngOnInit(): void {
  }

  getMark(value: any)
    {
      this.student.mark =  value;
    }
}
