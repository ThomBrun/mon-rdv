import { Component, OnInit } from '@angular/core';
import {ConsulteService} from '../../service/consulte.service';
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

  ngOnInit(): void {
  }

  listprat(): Array<Praticien>{
    return this.consulteService.findAll();
  }

  listspelieu(id: number){
    this.consulteService.findSpecialiteByPraticien(id).subscribe(resp => this.specialites = resp, error => console.log(error));
    this.consulteService.findLieuByPraticien(id).subscribe(resp => this.lieux = resp, error => console.log(error));
  }

  recherchePrat() {
    let input, filter, table, tr, td, i, txtValue;
    input = document.getElementById('pratSearch');
    filter = input.value.toUpperCase();
    table = document.getElementById('pratTable');
    tr = table.getElementsByTagName('tr');
    for (i = 0; i < tr.length; i++) {
      td = tr[i].getElementsByTagName('td')[0];
      if (td) {
        txtValue = td.textContent || td.innerText;
        if (txtValue.toUpperCase().indexOf(filter) > -1) {
          tr[i].style.display = '';
        } else {
          tr[i].style.display = 'none';
        }
      }
    }
  }

}
