import { Component, OnInit } from '@angular/core';
import {Utilisateur} from "../../model/utilisateur";
import {Praticien} from "../../model/praticien";
import {Patient} from "../../model/patient";

@Component({
  selector: 'app-inscription',
  templateUrl: './inscription.component.html',
  styleUrls: ['./inscription.component.scss']
})
export class InscriptionComponent implements OnInit {

  utilisateurForm: Utilisateur = new Utilisateur();

  constructor() { }

  // type(){
  //   if (this.utilisateurForm.type == "praticien"){
  //     this.utilisateurForm = new Praticien(null,null, this.utilisateurForm.type);
  //   } else if (this.utilisateurForm.type == "patient"){
  //     this.utilisateurForm = new Patient(null, null, this.utilisateurForm.type);
  //   }
  // }

  // add(){
  //   this.utilisateurForm = new Utilisateur();
  // }

  // save(){
  //   if (this.utilisateurForm.type == 'praticien'){
  //     this.inscriptionService.newPraticien(this.utilisateurForm).subscribe(resp => {
  //       this.inscriptionService.load();
  //       this.utilisateurForm = null;
  //     }, error => console.log(error));
  //   } else if (this.utilisateurForm.type == 'patient'){
  //     this.inscriptionService.newPatient(this.utilisateurForm).subscribe(resp => {
  //       this.inscriptionService.load();
  //       this.utilisateurForm = null;
  //     }, error => console.log(error));
  //   }
  // }

  ngOnInit(): void {
  }



}
