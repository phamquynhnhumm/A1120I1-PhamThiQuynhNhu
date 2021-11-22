import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { EdithdComponent } from './edithd.component';

describe('EdithdComponent', () => {
  let component: EdithdComponent;
  let fixture: ComponentFixture<EdithdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ EdithdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(EdithdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
