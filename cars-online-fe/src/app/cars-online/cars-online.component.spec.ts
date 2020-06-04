import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CarsOnlineComponent } from './cars-online.component';

describe('CarsOnlineComponent', () => {
  let component: CarsOnlineComponent;
  let fixture: ComponentFixture<CarsOnlineComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CarsOnlineComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CarsOnlineComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
