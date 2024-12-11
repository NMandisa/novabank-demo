import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Error301Component } from './error-301.component';

describe('Error301Component', () => {
  let component: Error301Component;
  let fixture: ComponentFixture<Error301Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Error301Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Error301Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
