import {Creneau} from './creneau';
import {Patient} from './patient';
import {Motif} from './motif';


export class Rdv {

  id: number;
  version: number;
  patient: Patient;
  motif: Motif;

  creneaux: Array<Creneau>;


  constructor(id?: number, version?: number, patient?: Patient, motif?: Motif, creneaux?: Array<Creneau>) {
    this.id = id;
    this.version = version;
    this.patient = patient;
    this.motif = motif;
    this.creneaux = creneaux;
  }
}

