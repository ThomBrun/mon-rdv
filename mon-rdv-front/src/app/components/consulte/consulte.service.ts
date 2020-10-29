import {Injectable} from '@angular/core';
import {Praticien} from '../../model/praticien';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Specialite} from '../../model/specialite';
import {Lieu} from '../../model/lieu';

@Injectable({
  providedIn: 'root'
})

export class ConsulteService {

  private praticiens: Array<Praticien> = new Array<Praticien>();

  constructor(private http: HttpClient) {
    this.load();
  }

  findAll(): Array<Praticien>{
    return this.praticiens;
  }

  findSpecialiteByPraticien(id: number): Observable<Array<Specialite>>{
    return this.http.get<Array<Specialite>>('http://localhost:8080/praticien/by-specialite/' + id);
  }

  findLieuByPraticien(id: number): Observable<Array<Lieu>>{
    return this.http.get<Array<Lieu>>('http://localhost:8080/praticien/by-lieu/' + id);
  }

  load() {
    this.http.get<Array<Praticien>>('http://localhost:8080/praticien').subscribe(resp => {this.praticiens = resp;
    }, error => console.log(error));
  }
}
