import { Component, OnInit } from '@angular/core';
import {khachhangDao} from '../../../dao/khachhangDao';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  khachhangs = khachhangDao;
  constructor() { }

  ngOnInit(): void {
  }

}
