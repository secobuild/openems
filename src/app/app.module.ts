import { NgModule, ErrorHandler } from '@angular/core';
import { MdSnackBar } from '@angular/material';

import { environment } from '../environments';

import { SharedModule } from './shared/shared.module';
import { WebappService, WebsocketService } from './shared/shared';
import { AboutModule } from './about/about.module';
import { OverviewModule } from './overview/overview.module';
import { DeviceModule } from './device/device.module';

import { AppComponent } from './app.component';

@NgModule({
  imports: [
    SharedModule,
    AboutModule,
    DeviceModule,
    OverviewModule
  ],
  declarations: [
    AppComponent
  ],
  bootstrap: [
    AppComponent
  ],
  providers: [
    MdSnackBar,
    {
      provide: ErrorHandler,
      useExisting: WebappService
    }
  ]
})
export class AppModule { }
