import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Praticien} from '../model/praticien';

@Injectable({
  providedIn: 'root'
})
export class PraticienService {

  private praticiens: Array<Praticien> = new Array<Praticien>();

  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Praticien> {
    return this.praticiens;
  }

  findById(id: number): Observable<Praticien> {
    return this.http.get<Praticien>('http://localhost:8080/praticien/' + id);
  }

  /*findByIdentifiant(identifiant: string): Observable<Praticien> {
    return this.http.get<Praticien>('http://localhost:8080/praticien/moncompte/' + identifiant);
  }*/

  create(praticien: Praticien) {
    return this.http.post<Praticien>('http://localhost:8080/praticien', praticien);
  }

  /*modify(praticien: Praticien) {
    return this.http.put<Praticien>('http://localhost:8080/praticien/' + praticien.id, praticien);
  }*/

  deleteById(id: number) {
    this.http.delete('http://localhost:8080/praticien/' + id).subscribe(resp => this.load(), error => console.log(error));
  }

  load() {
    this.http.get<Array<Praticien>>('http://localhost:8080/praticien').subscribe(resp => {
      this.praticiens = resp;
    }, error => console.log(error));
  }
}
