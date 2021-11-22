import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListhdComponent } from './listhd.component';

describe('ListhdComponent', () => {
  let component: ListhdComponent;
  let fixture: ComponentFixture<ListhdComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListhdComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListhdComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
