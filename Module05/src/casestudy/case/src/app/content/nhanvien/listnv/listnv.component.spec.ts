import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListnvComponent } from './listnv.component';

describe('ListnvComponent', () => {
  let component: ListnvComponent;
  let fixture: ComponentFixture<ListnvComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListnvComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListnvComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
