import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EditnvComponent } from './editnv.component';

describe('EditnvComponent', () => {
  let component: EditnvComponent;
  let fixture: ComponentFixture<EditnvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EditnvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EditnvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
