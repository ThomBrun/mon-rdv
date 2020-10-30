import { Injectable } from '@angular/core';
import {Rdv} from '../model/rdv';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Creneau} from '../model/creneau';

@Injectable({
  providedIn: 'root'
})
export class RdvService {

  private rdvs: Array<Rdv> = new Array<Rdv>();

  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Rdv> {
    return this.rdvs;
  }

  findById(id: number): Observable<Rdv> {
    return this.http.get<Rdv>('http://localhost:8080/rdv/' + id);
  }

  findCreneauByRdv(id: number): Observable<Array<Creneau>> {
    return this.http.get<Array<Creneau>>('http://localhost:8080/rdv/creneaux/' + id);
  }

  create(rdv: Rdv) {
    return this.http.post<Rdv>('http://localhost:8080/rdv', rdv);
  }

  /*modify(rdv: Rdv) {
    return this.http.put<Rdv>('http://localhost:8080/rdv/' + rdv.id, rdv);
  }*/

  deleteById(id: number) {
    this.http.delete('http://localhost:8080/rdv/' + id).subscribe(resp => this.load(), error => console.log(error));
  }

  load() {
    this.http.get<Array<Rdv>>('http://localhost:8080/rdv').subscribe(resp => {
      this.rdvs = resp;
    }, error => console.log(error));
  }

  getRdvId(rdv: Rdv): number{
    return JSON.parse(JSON.stringify(rdv)).id;
  }
}
