import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Praticien} from '../model/praticien';
import {Patient} from '../model/patient';

@Injectable({
  providedIn: 'root'
})
export class InscriptionService {

  private praticiens: Array<Praticien> = new Array<Praticien>();
  private patients: Array<Patient> = new Array<Patient>();

  constructor(private http: HttpClient) {
    this.load();
  }

  newPatient(patient: Patient) {
    return this.http.post<Patient>('http://localhost:8080/patient', patient);
  }

  newPraticien(praticien: Praticien) {
    return this.http.post<Praticien>('http://localhost:8080/praticien', praticien);
  }

  load() {
    this.http.get<Array<Praticien>>('http://localhost:8080/praticien').subscribe(resp => {
      this.praticiens = resp;
    }, error => console.log(error));
    this.http.get<Array<Patient>>('http://localhost:8080/patient').subscribe(resp => {
      this.patients = resp;
    }, error => console.log(error));
  }
}
