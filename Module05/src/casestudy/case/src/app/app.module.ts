import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FooterComponent } from './footer/footer.component';
import { HeaferComponent } from './heafer/heafer.component';
import { MenuComponent } from './menu/menu.component';
import { ContentComponent } from './content/content.component';
import { KhachhangComponent } from './content/khachhang/khachhang.component';
import { NhanvienComponent } from './content/nhanvien/nhanvien.component';
import { ListComponent } from './content/khachhang/list/list.component';
import { CreateComponent } from './content/khachhang/create/create.component';
import { EditComponent } from './content/khachhang/edit/edit.component';
import { DichvuComponent } from './content/dichvu/dichvu.component';
import { HopdongComponent } from './content/hopdong/hopdong.component';
import { EditnvComponent } from './content/nhanvien/editnv/editnv.component';
import { CreatenvComponent } from './content/nhanvien/createnv/createnv.component';
import { ListnvComponent } from './content/nhanvien/listnv/listnv.component';
import { CreatedvComponent } from './content/dichvu/createdv/createdv.component';
import { ListdvComponent } from './content/dichvu/listdv/listdv.component';
import { EditdvComponent } from './content/dichvu/editdv/editdv.component';
import { EdithdComponent } from './content/hopdong/edithd/edithd.component';
import { CreatehdComponent } from './content/hopdong/createhd/createhd.component';
import { ListhdComponent } from './content/hopdong/listhd/listhd.component';
import { CreatehdctComponent } from './content/hopdong/createhdct/createhdct.component';

@NgModule({
  declarations: [
    AppComponent,
    FooterComponent,
    HeaferComponent,
    MenuComponent,
    ContentComponent,
    KhachhangComponent,
    NhanvienComponent,
    ListComponent,
    CreateComponent,
    EditComponent,
    DichvuComponent,
    HopdongComponent,
    EditnvComponent,
    CreatenvComponent,
    ListnvComponent,
    CreatedvComponent,
    ListdvComponent,
    EditdvComponent,
    EdithdComponent,
    CreatehdComponent,
    ListhdComponent,
    CreatehdctComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
