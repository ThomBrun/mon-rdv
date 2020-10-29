import { Component } from '@angular/core';
import {SessionService} from './service/session.service';
import {Route, Router} from '@angular/router';
import {UtilisateurService} from './service/utilisateur.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'mon-rdv-front';

  identifiant: string;
  motDePasse: string;


  constructor(public sessionService: SessionService, public router: Router, private utilisateurService: UtilisateurService) {

  }


}
