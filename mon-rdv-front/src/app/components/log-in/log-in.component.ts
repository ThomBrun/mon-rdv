import { Component, OnInit } from '@angular/core';
import {SessionService} from '../../service/session.service';
import {UtilisateurService} from '../../service/utilisateur.service';
import {Router} from '@angular/router';


@Component({
  selector: 'app-log-in',
  templateUrl: './log-in.component.html',
  styleUrls: ['./log-in.component.scss']
})
export class LogInComponent implements OnInit {

  identifiant: string;
  motDePasse: string;

  constructor(private sessionService: SessionService, private utilisateurService: UtilisateurService, private router: Router) { }

  ngOnInit(): void {
  }

  checkUser() {
    this.utilisateurService.findByIdentifiantAndMotDePasse(this.identifiant, this.motDePasse).subscribe(resp => {
        this.sessionService.setUtilisateur(resp);
        this.router.navigateByUrl('/accueil');
      },
      error => console.log(error)
    );
  }

}
