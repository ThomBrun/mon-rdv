import { Injectable } from '@angular/core';
import {Rdv} from '../model/rdv';
import {Lieu} from '../model/lieu';

@Injectable({
  providedIn: 'root'
})
export class LieuService {

  private lieux: Array<Lieu> = new Array<Lieu>();

  constructor() { }
}
