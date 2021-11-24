import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {KhachHang} from '../../../model/KhachHang';

@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.css']
})
export class EditComponent implements OnInit {

  @Input()
  khachhangedits: KhachHang;
  @Output()
  khachhangedit: EventEmitter<KhachHang> = new EventEmitter<KhachHang>();
  constructor() { }

  ngOnInit(): void {
    console.log('lấy giá trị:' + this.khachhangedits);
  }

  getName(event: Event) {
    // @ts-ignore
    this.khachhangedit.emit(event.target.value);
    // @ts-ignore
    console.log('in rá  xem sao' + event.target.value);
    // @ts-ignore
  }
}
