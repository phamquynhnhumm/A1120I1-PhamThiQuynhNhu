import {Component, Input, OnInit} from '@angular/core';
import {NhanVien} from '../../../model/NhanVien';
import {KhachHang} from "../../../model/KhachHang";

@Component({
  selector: 'app-editnv',
  templateUrl: './editnv.component.html',
  styleUrls: ['./editnv.component.css']
})
export class EditnvComponent implements OnInit {

  @Input()
  nhanvieneditaa: NhanVien;
  constructor() { }

  ngOnInit(): void {
  }

}
