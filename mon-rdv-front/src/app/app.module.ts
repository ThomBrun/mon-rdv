import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

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
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
