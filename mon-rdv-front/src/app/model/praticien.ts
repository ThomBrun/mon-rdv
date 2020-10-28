import {Creneau} from './creneau';
import {Lieu} from './lieu';
import {Motif} from './motif';
import {Specialite} from './specialite';

export class Praticien {

  nom: string;
  prenom: string;
  uniteHoraire: number;

  specialites: Array<Specialite>;
  creneaux: Array<Creneau>;
  lieux: Array<Lieu>;
  motifs: Array<Motif>;


  constructor(nom?: string, prenom?: string, uniteHoraire?: number, specialites?: Array<Specialite>,
              creneaux?: Array<Creneau>, lieux?: Array<Lieu>, motifs?: Array<Motif>) {

    this.nom = nom;
    this.prenom = prenom;
    this.uniteHoraire = uniteHoraire;
    this.specialites = specialites;
    this.creneaux = creneaux;
    this.lieux = lieux;
    this.motifs = motifs;
  }
}
