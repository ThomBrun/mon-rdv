import {Praticien} from './praticien';


export class Specialite {

  id: number;
  version: number;
  nom: string;

  praticiens: Array<Praticien>;


  constructor(id?: number, version?: number, nom?: string, praticiens?: Array<Praticien>) {
    this.id = id;
    this.version = version;
    this.nom = nom;
    this.praticiens = praticiens;
  }
}




