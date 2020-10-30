import {Rdv} from './rdv';
import {Utilisateur} from "./utilisateur";

export class Patient extends Utilisateur{

  nom: string;
  prenom: string;
  dtNaissance: Date;
  numero: number;
  rue: string;
  codePostal: number;
  ville: string;

  Rdvs: Array<Rdv>;


  constructor(id: number, version: number, type: string, identifiant: string, motDePasse: string, email: string, nom: string, prenom: string, dtNaissance: Date, numero: number, rue: string, codePostal: number, ville: string, Rdvs: Array<Rdv>) {
    super(id, version, type, identifiant, motDePasse, email);
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
