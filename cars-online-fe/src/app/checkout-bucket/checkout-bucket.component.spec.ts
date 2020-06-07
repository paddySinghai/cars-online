import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CheckoutBucketComponent } from './checkout-bucket.component';

describe('CheckoutBucketComponent', () => {
  let component: CheckoutBucketComponent;
  let fixture: ComponentFixture<CheckoutBucketComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CheckoutBucketComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CheckoutBucketComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
