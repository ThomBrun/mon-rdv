import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { PageDaccueilComponent } from './components/page-daccueil/page-daccueil.component';
import { LogInComponent } from './components/log-in/log-in.component';
import { InscriptionComponent } from './components/inscription/inscription.component';
import { ConsulteComponent } from './components/consulte/consulte.component';
import { PrendreRdvComponent } from './components/prendre-rdv/prendre-rdv.component';
import { RdvPatientComponent } from './components/rdv-patient/rdv-patient.component';
import { RdvPraticienComponent } from './components/rdv-praticien/rdv-praticien.component';
import { InfoPatientComponent } from './components/info-patient/info-patient.component';
import { InfoPraticienComponent } from './components/info-praticien/info-praticien.component';
import { DisponibilitesComponent } from './components/disponibilites/disponibilites.component';

import { CommonModule } from '@angular/common';
import { FlatpickrModule } from 'angularx-flatpickr';
import { CalendarModule, DateAdapter } from 'angular-calendar';
import { adapterFactory } from 'angular-calendar/date-adapters/date-fns';
import { NgbModalModule, NgbModule } from '@ng-bootstrap/ng-bootstrap';


@NgModule({
  declarations: [
    AppComponent,
    PageDaccueilComponent,
    LogInComponent,
    InscriptionComponent,
    ConsulteComponent,
    PrendreRdvComponent,
    RdvPatientComponent,
    RdvPraticienComponent,
    InfoPatientComponent,
    InfoPraticienComponent,
    DisponibilitesComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    CommonModule,
    NgbModalModule,
    FlatpickrModule.forRoot(),
    CalendarModule.forRoot({
      provide: DateAdapter,
      useFactory: adapterFactory,
    }),
    NgbModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
