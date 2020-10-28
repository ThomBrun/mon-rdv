import {Creneau} from './creneau';
import {Praticien} from './praticien';
import {Motif} from './motif';

export class Lieu {

  id: number;
  version: number;
  nom: string;
  rue: string;
  ville: string;
  codePostal: number;
  numero: number;

  creneaux: Array<Creneau>;
  praticiens: Array<Praticien>;
  motifs: Array<Motif>;


  constructor(id?: number, version?: number, nom?: string, rue?: string, ville?: string, codePostal?: number,
              numero?: number, creneaux?: Array<Creneau>, praticiens?: Array<Praticien>, motifs?: Array<Motif>) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.rue = rue;
    this.ville = ville;
    this.codePostal = codePostal;
    this.numero = numero;
    this.creneaux = creneaux;
    this.praticiens = praticiens;
    this.motifs = motifs;
  }
}



