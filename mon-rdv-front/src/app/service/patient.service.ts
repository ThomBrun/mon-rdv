import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Patient} from '../model/patient';
import {Rdv} from '../model/rdv';

@Injectable({
  providedIn: 'root'
})
export class PatientService {

  private patients: Array<Patient> = new Array<Patient>();

  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Patient> {
    return this.patients;
  }

  findById(id: number): Observable<Patient> {
    return this.http.get<Patient>('http://localhost:8080/patient/' + id);
  }

  /*findByIdentifiant(identifiant: string): Observable<Patient> {
    return this.http.get<Patient>('http://localhost:8080/patient/moncompte/' + identifiant);
  }*/

  findRdvByPatient(id: number): Observable<Array<Rdv>> {
    return this.http.get<Array<Rdv>>('http://localhost:8080/patient/mesrdvspat/' + id);
  }

  create(patient: Patient) {
    return this.http.post<Patient>('http://localhost:8080/patient', patient);
  }

  /*modify(patient: Patient) {
    return this.http.put<Patient>('http://localhost:8080/patient/' + patient.id, patient);
  }*/

  deleteById(id: number) {
    this.http.delete('http://localhost:8080/patient/' + id).subscribe(resp => this.load(), error => console.log(error));
  }

  load() {
    this.http.get<Array<Patient>>('http://localhost:8080/patient').subscribe(resp => {
      this.patients = resp;
    }, error => console.log(error));
  }
}
