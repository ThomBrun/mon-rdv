import { Component, OnInit } from '@angular/core';
import {ConsulteService} from './consulte.service';
import {Specialite} from '../../model/specialite';
import {Lieu} from '../../model/lieu';
import {Praticien} from '../../model/praticien';

@Component({
  selector: 'app-consulte',
  templateUrl: './consulte.component.html',
  styleUrls: ['./consulte.component.scss']
})
export class ConsulteComponent implements OnInit {

  specialites: Array<Specialite> = new Array<Specialite>();
  lieux: Array<Lieu> = new Array<Lieu>();
  praticiens: Array<Praticien> = new Array<Praticien>();

  constructor(private consulteService: ConsulteService) {
  }

  list(): Array<Praticien>{
    return this.consulteService.findAll();
//    this.consulteService.findSpecialiteByPraticien(id).subscribe(resp => this.specialites = resp, error => console.log(error));
//    this.consulteService.findLieuByPraticien(id).subscribe(resp => this.lieux = resp, error => console.log(error));
  }

  ngOnInit(): void {
  }

}
