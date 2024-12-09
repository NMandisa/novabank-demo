import { AfterViewInit, Component, ElementRef, OnInit, ViewChild } from '@angular/core';

@Component({
  selector: 'app-temporary-banner',
  imports: [],
  templateUrl: './temporary-banner.component.html',
  styleUrl: './temporary-banner.component.scss'
})
export class TemporaryBannerComponent implements OnInit, AfterViewInit {
  ngOnInit(): void {
    throw new Error('Method not implemented.');
  }

  showBanner: boolean = true;  // Flag to control the banner visibility

  // Access the banner element via @ViewChild
  //@ViewChild('tempBanner') banner!: ElementRef;
  @ViewChild('tempBanner', { static: true }) banner!: ElementRef;

  ngAfterViewInit(): void {
    // This lifecycle hook ensures the banner is available after view initialization
    if (this.banner && this.showBanner) {
      this.banner.nativeElement.style.display = 'block'; // Make sure it's visible
    }
  }

    // Method to dismiss the banner
    dismissBanner(): void {
      if (this.banner) {
        this.banner.nativeElement.style.display = 'none';
        this.showBanner = false;  // Hide the banner by setting flag to false
      }
    }    

}
