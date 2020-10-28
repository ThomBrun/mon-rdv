import {Rdv} from './rdv';
import {Praticien} from './praticien';
import {Lieu} from './lieu';


export class Creneau {

  id: number;
  version: number;
  date: Date;
  rdv: Rdv;

  praticien: Praticien;
  lieu: Lieu;


  constructor(id?: number, version?: number, date?: Date, rdv?: Rdv, praticien?: Praticien, lieu?: Lieu) {
    this.id = id;
    this.version = version;
    this.date = date;
    this.rdv = rdv;
    this.praticien = praticien;
    this.lieu = lieu;
  }
}
