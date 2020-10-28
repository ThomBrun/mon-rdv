import {Praticien} from './praticien';
import {Lieu} from './lieu';
import {Rdv} from './rdv';

export class Motif {

  id: number;
  version: number;
  nom: string;
  duree: number;

  praticien: Praticien;
  Rdvs: Array<Rdv>;
  lieux: Array<Lieu>;


  constructor(id?: number, version?: number, nom?: string, duree?: number, praticien?: Praticien, Rdvs?: Array<Rdv>, lieux?: Array<Lieu>) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.duree = duree;
    this.praticien = praticien;
    this.Rdvs = Rdvs;
    this.lieux = lieux;
  }
}
