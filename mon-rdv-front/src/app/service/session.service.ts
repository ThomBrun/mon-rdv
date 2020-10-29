import { Injectable } from '@angular/core';
import {Utilisateur} from '../model/utilisateur';
import {Administrateur} from '../model/administrateur';
import {Patient} from '../model/patient';
import {Praticien} from '../model/praticien';


@Injectable({
  providedIn: 'root'
})
export class SessionService {

  constructor() {
    this.setUtilisateur(new Utilisateur());
  }

  getClient(): Patient{
    return JSON.parse(sessionStorage.getItem('utilisateur'));
  }

  getFournisseur(): Praticien{
    return JSON.parse(sessionStorage.getItem('utilisateur'));
  }

  getAdmin(): Administrateur{
    return JSON.parse(sessionStorage.getItem('utilisateur'));
  }

  setUtilisateur(utilisateur: Utilisateur){
    sessionStorage.setItem('utilisateur', JSON.stringify(utilisateur));
  }

  getUtilisateur(){
    return JSON.parse(sessionStorage.getItem('utilisateur'));
  }

  getIdentifiant(): string {
    return JSON.parse(sessionStorage.getItem('utilisateur')).identifiant;
  }

  offUtilisateur(){
    sessionStorage.clear();
    window.location.reload();
    location.replace('/accueil');
  }

}
