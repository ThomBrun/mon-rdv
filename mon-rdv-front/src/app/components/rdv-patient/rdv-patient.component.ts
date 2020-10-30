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

  events: CalendarEvent[] = [
    /*{
      start: subDays(startOfDay(new Date()), 1),
      end: addDays(new Date(), 1),
      title: 'A 3 day event',
      color: colors.red,
      actions: this.actions,
      allDay: true,
      resizable: {
        beforeStart: true,
        afterEnd: true,
      },
      draggable: true,
    },
    {
      start: startOfDay(new Date()),
      title: 'An event with no end date',
      color: colors.yellow,
      actions: this.actions,
    },
    {
      start: subDays(endOfMonth(new Date()), 3),
      end: addDays(endOfMonth(new Date()), 3),
      title: 'A long event that spans 2 months',
      color: colors.blue,
      allDay: true,
    },
    {
      start: addHours(startOfDay(new Date()), 2),
      end: addHours(new Date(), 2),
      title: 'A draggable and resizable event',
      color: colors.yellow,
      actions: this.actions,
      resizable: {
        beforeStart: true,
        afterEnd: true,
      },
      draggable: true,
    },*/
  ];

  activeDayIsOpen = true;

  rdvs: Array<Rdv> = new Array<Rdv>();
  IDpat: number;

  constructor(private modal: NgbModal, private patientService: PatientService, private sessionService: SessionService,
              private rdvService: RdvService) {
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
    let DateDBTRdv: number | Date;
    let DateFINRdv: number | Date;
    let lieu;
    for (const rd of this.rdvs) {
      // tslint:disable-next-line:max-line-length
      this.rdvService.findCreneauByRdv(this.rdvService.getRdvId(rd)).subscribe(resp => {DateDBTRdv = resp[0].date ;
        // tslint:disable-next-line:max-line-length
                                                                                        DateFINRdv = resp[resp.length - 1].date ;


                                                                                        //lieu = resp[0].id//rd.creneaux[0].lieu;

        //this.events.push({
        console.log(DateDBTRdv, DateFINRdv, lieu);
        this.events = [
          ...this.events,
          {
            title: lieu,
            start: DateDBTRdv,
            end: DateFINRdv,
          actions: this.actions,
          color: colors.red,
            draggable: true,
            resizable: {
              beforeStart: true,
              afterEnd: true,
            },
          },
    ];

      }, error => console.log(error));



    }
  }

}




