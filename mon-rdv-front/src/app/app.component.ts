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
    // this.connexionEnTantQuePatient();
    // this.connexionEnTantQueAdministrateur();
    // this.connexionEnTantQuePraticien();
  }

  connexionEnTantQuePatient() {
    this.utilisateurService.findByIdentifiantAndMotDePasse('pat1id', 'pat1mdp').subscribe(resp => {
        this.sessionService.setUtilisateur(resp);
        this.router.navigateByUrl('/accueil');
      },
      error => console.log(error)
    );
  }

  connexionEnTantQueAdministrateur() {
    this.utilisateurService.findByIdentifiantAndMotDePasse('admin1', 'admin1mdp').subscribe(resp => {
        this.sessionService.setUtilisateur(resp);
        this.router.navigateByUrl('/accueil');
      },
      error => console.log(error)
    );
  }

  connexionEnTantQuePraticien() {
    this.utilisateurService.findByIdentifiantAndMotDePasse('p1id', 'p1mdp').subscribe(resp => {
        this.sessionService.setUtilisateur(resp);
        this.router.navigateByUrl('/accueil');
      },
      error => console.log(error)
    );
  }


}
