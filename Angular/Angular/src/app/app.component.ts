import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Angular';
  name = 'quynhnhu.com';
  isDisabled = false;
  //
  // clearValue()  {
  //   this.name= '';
  // }
}
