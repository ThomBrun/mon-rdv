import { Component, OnInit } from '@angular/core';
import {PatientService} from '../../service/patient.service';

import {
  ChangeDetectionStrategy,
  ViewChild,
  TemplateRef,
} from '@angular/core';
import {
  startOfDay,
  endOfDay,
  subDays,
  addDays,
  endOfMonth,
  isSameDay,
  isSameMonth,
  addHours,
} from 'date-fns';
import { Subject } from 'rxjs';
import { NgbModal } from '@ng-bootstrap/ng-bootstrap';
import {
  CalendarEvent,
  CalendarEventAction,
  CalendarEventTimesChangedEvent,
  CalendarView,
} from 'angular-calendar';
import {ConsulteService} from '../../service/consulte.service';
import {Lieu} from '../../model/lieu';
import {Rdv} from '../../model/rdv';
import {SessionService} from '../../service/session.service';
import {RdvService} from '../../service/rdv.service';
import {Creneau} from '../../model/creneau';
import {LieuService} from '../../service/lieu.service';

const colors: any = {
  red: {
    primary: '#ad2121',
    secondary: '#FAE3E3',
  },
  blue: {
    primary: '#1e90ff',
    secondary: '#D1E8FF',
  },
  yellow: {
    primary: '#e3bc08',
    secondary: '#FDF1BA',
  },
};

@Component({
  selector: 'app-rdv-patient',
  changeDetection: ChangeDetectionStrategy.OnPush,
  templateUrl: './rdv-patient.component.html',
  styleUrls: ['./rdv-patient.component.scss']
})
export class RdvPatientComponent implements OnInit {

  /*constructor() { }
  ngOnInit(): void {

  }*/

  @ViewChild('modalContent', { static: true }) modalContent: TemplateRef<any>;

  view: CalendarView = CalendarView.Month;

  CalendarView = CalendarView;

  viewDate: Date = new Date();

  modalData: {
    action: string;
    event: CalendarEvent;
  };

  actions: CalendarEventAction[] = [
    {
      label: '<i class="fas fa-fw fa-pencil-alt"></i>',
      a11yLabel: 'Edit',
      onClick: ({ event }: { event: CalendarEvent }): void => {
        this.handleEvent('Edited', event);
      },
    },
    {
      label: '<i class="fas fa-fw fa-trash-alt"></i>',
      a11yLabel: 'Delete',
      onClick: ({ event }: { event: CalendarEvent }): void => {
        this.events = this.events.filter((iEvent) => iEvent !== event);
        this.handleEvent('Deleted', event);
      },
    },
  ];

  refresh: Subject<any> = new Subject();

  events: CalendarEvent[] = [];

  activeDayIsOpen = true;

  rdvs: Array<Rdv> = new Array<Rdv>();
  IDpat: number;

  constructor(private modal: NgbModal, private patientService: PatientService, private sessionService: SessionService,
              private rdvService: RdvService, private lieuService: LieuService) {
    this.IDpat = this.sessionService.getUserId();
  }

  ngOnInit(): void {
    this.patientService.findRdvByPatient(this.IDpat).subscribe(resp => {this.rdvs = resp; this.addRdvs(); }, error => console.log(error));
  }

  dayClicked({ date, events }: { date: Date; events: CalendarEvent[] }): void {
    if (isSameMonth(date, this.viewDate)) {
      if (
        (isSameDay(this.viewDate, date) && this.activeDayIsOpen === true) ||
        events.length === 0
      ) {
        this.activeDayIsOpen = false;
      } else {
        this.activeDayIsOpen = true;
      }
      this.viewDate = date;
    }
  }

  eventTimesChanged({
                      event,
                      newStart,
                      newEnd,
                    }: CalendarEventTimesChangedEvent): void {
    this.events = this.events.map((iEvent) => {
      if (iEvent === event) {
        return {
          ...event,
          start: newStart,
          end: newEnd,
        };
      }
      return iEvent;
    });
    this.handleEvent('Dropped or resized', event);
  }

  handleEvent(action: string, event: CalendarEvent): void {
    this.modalData = { event, action };
    this.modal.open(this.modalContent, { size: 'lg' });
  }

  addEvent(): void {
    /*this.events = [
      ...this.events,
      {
        title: 'New event',
        start: startOfDay(new Date()),
        end: endOfDay(new Date()),
        color: colors.red,
        draggable: true,
        resizable: {
          beforeStart: true,
          afterEnd: true,
        },
      },
    ];*/
  }

  addEvent2(lieu: string, DateDBTRdv: Date, DateFINRdv: Date): void {
    this.events.push({
      title: lieu,
      start: new Date(DateDBTRdv.toString()),
      end: new Date(DateFINRdv.toString()),
      color: colors.red,
      draggable: true,
      resizable: {
        beforeStart: true,
        afterEnd: true,
      },
    });
    this.refresh.next();
  }

  deleteEvent(eventToDelete: CalendarEvent) {
    this.events = this.events.filter((event) => event !== eventToDelete);
  }

  setView(view: CalendarView) {
    this.view = view;
  }

  closeOpenMonthViewDay() {
    this.activeDayIsOpen = false;
  }

  addRdvs(){
    console.log('nombre de rdv');
    console.log(this.rdvs.length);

    let lieu;
    for (const rd of this.rdvs) {
      let creneau1: Creneau;
      let DateDBTRdv: Date;
      let DateFINRdv: Date;
      this.rdvService.findCreneauByRdv(this.rdvService.getRdvId(rd)).subscribe(resp => {DateDBTRdv = resp[0].date ;
        DateFINRdv = resp[resp.length - 1].date ;
        creneau1 = resp[0];

        // tslint:disable-next-line:variable-name
        let creneau_rdv: Creneau[];
        for (const l of this.lieuService.findAll()){
          this.lieuService.findCreneauByLieu(l.id).subscribe(resp2 => {creneau_rdv = resp2;
              for (const c of creneau_rdv){
                if (c.id === creneau1.id){
                  lieu = l.nom;
                  console.log(DateDBTRdv, DateFINRdv, lieu);
                  this.addEvent2(lieu + ', ' + l.numero + ' ' + l.rue + ' ' + l.ville + ' ' + l.codePostal, DateDBTRdv, DateFINRdv);
                }
              };


          } ,
            error => console.log(error));

        }
      }, error => console.log(error));



    }
  }

}




