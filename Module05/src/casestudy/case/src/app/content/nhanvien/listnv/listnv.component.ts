import { Component, OnInit } from '@angular/core';
import {nhanvienDao} from '../../../dao/nhanvienDao';

@Component({
  selector: 'app-listnv',
  templateUrl: './listnv.component.html',
  styleUrls: ['./listnv.component.css']
})
export class ListnvComponent implements OnInit {
  nhanviens = nhanvienDao;
  constructor() { }

  ngOnInit(): void {
  }
}
