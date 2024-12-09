import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TemporaryBannerComponent } from './temporary-banner.component';

describe('TemporaryBannerComponent', () => {
  let component: TemporaryBannerComponent;
  let fixture: ComponentFixture<TemporaryBannerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [TemporaryBannerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TemporaryBannerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
