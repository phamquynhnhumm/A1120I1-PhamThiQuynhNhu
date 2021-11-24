import {Component, OnInit} from '@angular/core';
import {khachhangDao} from '../../../dao/khachhangDao';
import {KhachHang} from '../../../model/KhachHang';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {
  khachhangs = khachhangDao;
  khachhangviewv: KhachHang;
  khachhangedit: KhachHang;

  constructor() {
  }

  ngOnInit(): void {
  }

  getkhachhangID(value: KhachHang) {
    this.khachhangviewv = value;
    console.log(this.khachhangviewv);
  }
  khachhangedita(value: KhachHang) {
    this.khachhangedit = value;
    console.log(this.khachhangedit);
  }

  getName(event: KhachHang) {
    console.log('sao không lấy đưỡcj giá trị nhr');
    console.log(event);
  }
}
