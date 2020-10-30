import { Injectable } from '@angular/core';
import {Rdv} from '../model/rdv';
import {Lieu} from '../model/lieu';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Creneau} from '../model/creneau';

@Injectable({
  providedIn: 'root'
})
export class LieuService {

  private lieux: Array<Lieu> = new Array<Lieu>();

  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Lieu> {
    return this.lieux;
  }

  findById(id: number): Observable<Lieu> {
    return this.http.get<Lieu>('http://localhost:8080/lieu/' + id);
  }

  findCreneauByLieu(id: number): Observable<Array<Creneau>> {
    return this.http.get<Array<Creneau>>('http://localhost:8080/lieu/creneaux/' + id);
  }

  create(lieu: Lieu) {
    return this.http.post<Lieu>('http://localhost:8080/lieu', lieu);
  }

  /*modify(lieu: Lieu) {
    return this.http.put<Lieu>('http://localhost:8080/lieu/' + lieu.id, lieu);
  }*/

  deleteById(id: number) {
    this.http.delete('http://localhost:8080/lieu/' + id).subscribe(resp => this.load(), error => console.log(error));
  }

  load() {
    this.http.get<Array<Lieu>>('http://localhost:8080/lieu').subscribe(resp => {
      this.lieux = resp;
    }, error => console.log(error));
  }
}
