import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {ConsulteComponent} from './components/consulte/consulte.component';
import {DisponibilitesComponent} from './components/disponibilites/disponibilites.component';
import {InfoPatientComponent} from './components/info-patient/info-patient.component';
import {InfoPraticienComponent} from './components/info-praticien/info-praticien.component';
import {InscriptionComponent} from './components/inscription/inscription.component';
import {LogInComponent} from './components/log-in/log-in.component';
import {PageDaccueilComponent} from './components/page-daccueil/page-daccueil.component';
import {PrendreRdvComponent} from './components/prendre-rdv/prendre-rdv.component';
import {RdvPatientComponent} from './components/rdv-patient/rdv-patient.component';
import {RdvPraticienComponent} from './components/rdv-praticien/rdv-praticien.component';


const routes: Routes = [
  {path: '', component: PageDaccueilComponent},
  {path: 'accueil', component: PageDaccueilComponent},
  {path: 'consulte', component: ConsulteComponent},
  {path: 'disponibilites', component: DisponibilitesComponent},
  {path: 'infoPatient', component: InfoPatientComponent},
  {path: 'infoPraticien', component: InfoPraticienComponent},
  {path: 'inscription', component: InscriptionComponent},
  {path: 'logIn', component: LogInComponent},
  {path: 'prendreRdv', component: PrendreRdvComponent},
  {path: 'rdvPatient', component: RdvPatientComponent},
  {path: 'rdvPraticien', component: RdvPraticienComponent},
  {path: 'mesrdvspat', component: RdvPatientComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
