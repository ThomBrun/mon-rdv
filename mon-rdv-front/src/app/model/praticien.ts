import {Creneau} from './creneau';
import {Lieu} from './lieu';
import {Motif} from './motif';
import {Specialite} from './specialite';
import {Utilisateur} from "./utilisateur";

export class Praticien extends Utilisateur {

  nom: string;
  prenom: string;
  uniteHoraire: number;

  specialites: Array<Specialite>;
  creneaux: Array<Creneau>;
  lieux: Array<Lieu>;
  motifs: Array<Motif>;


  constructor(id: number, version: number, type: string, identifiant: string, motDePasse: string, email: string, nom: string, prenom: string, uniteHoraire: number, specialites: Array<Specialite>, creneaux: Array<Creneau>, lieux: Array<Lieu>, motifs: Array<Motif>) {
    super(id, version, type, identifiant, motDePasse, email);
    this.nom = nom;
    this.prenom = prenom;
    this.uniteHoraire = uniteHoraire;
    this.specialites = specialites;
    this.creneaux = creneaux;
    this.lieux = lieux;
    this.motifs = motifs;
  }
}
