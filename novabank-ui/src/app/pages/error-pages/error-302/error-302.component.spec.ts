import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Error302Component } from './error-302.component';

describe('Error302Component', () => {
  let component: Error302Component;
  let fixture: ComponentFixture<Error302Component>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [Error302Component]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Error302Component);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
