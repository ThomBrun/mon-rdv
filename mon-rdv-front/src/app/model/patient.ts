import {Rdv} from './rdv';

export class Patient {

  nom: string;
  prenom: string;
  dtNaissance: Date;
  numero: number;
  rue: string;
  codePostal: number;
  ville: string;

  Rdvs: Array<Rdv>;


  constructor(nom?: string, prenom?: string, dtNaissance?: Date, numero?: number, rue?: string,
              codePostal?: number, ville?: string, Rdvs?: Array<Rdv>) {

    this.nom = nom;
    this.prenom = prenom;
    this.dtNaissance = dtNaissance;
    this.numero = numero;
    this.rue = rue;
    this.codePostal = codePostal;
    this.ville = ville;
    this.Rdvs = Rdvs;
  }
}
