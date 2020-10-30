export class Utilisateur {
  id: number;
  version: number;
  type: string;
  identifiant: string;
  motDePasse: string;
  email: string;


  constructor(id?: number, version?: number, type?: string, identifiant?: string, motDePasse?: string, email?: string) {
    this.id = id;
    this.version = version;
    this.type = type;
    this.identifiant = identifiant;
    this.motDePasse = motDePasse;
    this.email = email;

  }

}
