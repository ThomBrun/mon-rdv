package formation.monrdv;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import formation.monrdv.model.Administrateur;
import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;
import formation.monrdv.model.Motif;
import formation.monrdv.model.Patient;
import formation.monrdv.model.Praticien;
import formation.monrdv.model.Rdv;
import formation.monrdv.model.Specialite;
import formation.monrdv.model.Utilisateur;
import formation.monrdv.repository.IAdministrateurRepository;
import formation.monrdv.repository.ICreneauRepository;
import formation.monrdv.repository.ILieuRepository;
import formation.monrdv.repository.IMotifRepository;
import formation.monrdv.repository.IPatientRepository;
import formation.monrdv.repository.IPraticienRepository;
import formation.monrdv.repository.IRdvRepository;
import formation.monrdv.repository.ISpecialiteRepository;
import formation.monrdv.repository.IUtilisateurRepository;

@SpringBootTest
class MonRdvApplicationTests {

	@Autowired
	private IAdministrateurRepository adminRepo;
	@Autowired
	private ICreneauRepository creneauRepo;
	@Autowired
	private ILieuRepository lieuRepo;
	@Autowired
	private IMotifRepository motifRepo;
	@Autowired
	private IPatientRepository patientRepo;
	@Autowired
	private IPraticienRepository praticienRepo;
	@Autowired
	private IRdvRepository rdvRepo;
	@Autowired
	private ISpecialiteRepository specialiteRepo;
	@Autowired
	private IUtilisateurRepository utilisateurRepo;
	

	
	@Test
	void contextLoads() throws ParseException {
		
			Lieu lieu1 = new Lieu("Clinique de l'abbaye", "chemin de traverse", "Pessac", 33600, 5, null, null, null);
			lieuRepo.save(lieu1);
			
			Lieu lieu2 = new Lieu("Hôpital Salpetrière", "Boulevard de l'Hôpital", "Paris", 75013, 47, null, null, null);
			lieuRepo.save(lieu2);
			
			Lieu lieu3 = new Lieu("Hôpital Haut-Lévêque", "Avenue Magellan", "Pessac", 33600 , 3, null, null, null);
			lieuRepo.save(lieu3);
			
			Lieu lieu4 = new Lieu("Clinique Saint-Augustin", "avenue d'Arès", "Bordeaux", 33074  , 3, null, null, null);
			lieuRepo.save(lieu4);
			
			///////////////////////////////////////////////////////////////////////////////////
			
		    SimpleDateFormat sdf2 = null;
			sdf2 = new SimpleDateFormat("yyyyMMddHHmmss");
			
			Creneau creneau1 = new Creneau(sdf2.parse("20201028080000"), null, null, null); //08h le 28/10/2020, unite horaire = 10
			creneauRepo.save(creneau1);
			
			Creneau creneau2 = new Creneau(sdf2.parse("20201028081000"), null, null, null);
			creneauRepo.save(creneau2);
			
			Creneau creneau3 = new Creneau(sdf2.parse("20201028082000"), null, null, null);
			creneauRepo.save(creneau3);
			
			Creneau creneau4 = new Creneau(sdf2.parse("20201028083000"), null, null, null);
			creneauRepo.save(creneau4);
			
			Creneau creneau5 = new Creneau(sdf2.parse("20201028084000"), null, null, null);
			creneauRepo.save(creneau5);
			
			Creneau creneau6 = new Creneau(sdf2.parse("20201028085000"), null, null, null);
			creneauRepo.save(creneau6);
			
			////////
			
			Creneau creneau7 = new Creneau(sdf2.parse("20201028140000"), null, null, null); //14h le 28/10/2020, unite horaire = 10
			creneauRepo.save(creneau7);
			
			Creneau creneau8 = new Creneau(sdf2.parse("20201028141000"), null, null, null);
			creneauRepo.save(creneau8);
			
			Creneau creneau9 = new Creneau(sdf2.parse("20201028142000"), null, null, null);
			creneauRepo.save(creneau9);
			
			////////
			
			Creneau creneau10 = new Creneau(sdf2.parse("20201028100000"), null, null, null); //10h le 29/10/2020, unite horaire = 15
			creneauRepo.save(creneau10);
			
			Creneau creneau11 = new Creneau(sdf2.parse("20201028101500"), null, null, null);
			creneauRepo.save(creneau11);
			
			Creneau creneau12 = new Creneau(sdf2.parse("20201028103000"), null, null, null);
			creneauRepo.save(creneau12);
			
			Creneau creneau13 = new Creneau(sdf2.parse("20201028104500"), null, null, null);
			creneauRepo.save(creneau13);
			
			///////////////////////////////////////////////////////////////////////////////////
			
			Specialite specialite1 = new Specialite("Orthodontie", null);
			specialiteRepo.save(specialite1);
			
			Specialite specialite2 = new Specialite("Pédiatre", null);
			specialiteRepo.save(specialite2);
			
			Specialite specialite3 = new Specialite("kinésithérapeute", null);
			specialiteRepo.save(specialite3);
			
			///////////////////////////////////////////////////////////////////////////////////

			Praticien praticien1 = new Praticien("Robert", "Richelieu", 10, null, null, null, null);
			praticienRepo.save(praticien1);
			
			Praticien praticien2 = new Praticien("Christophe", "Pascot", 10, null, null, null, null);
			praticienRepo.save(praticien2);
			
			Praticien praticien3 = new Praticien("Laura", "Durand", 15, null, null, null, null);
			praticienRepo.save(praticien3);
			

			
//			Praticien praticien = new Praticien();
//			praticienRepo.save(praticien);
//			
//			Lieu lieu = new Lieu();
//			lieuRepo.save(lieu);
//			
//			Patient patient = new Patient();
//			patientRepo.save(patient);
//
//			Specialite specialite = new Specialite();
//			specialiteRepo.save(specialite);
//
//			
			SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

			Administrateur admin1 = new Administrateur();
			Administrateur admin2 = new Administrateur();
			admin1.setEmail("admin1@gmail.com");
			admin2.setEmail("admin2@hotmail.fr");
			admin1.setIdentifiant("admin1");
			admin2.setIdentifiant("admin2");
			admin1.setMotDePasse("admin1mdp");
			admin2.setMotDePasse("admin2mdp");
			adminRepo.save(admin1);
			adminRepo.save(admin2);
			
			Patient patient1 = new Patient("Truc", "Jean-Pierre", sdf1.parse("14/11/1999"), 37, "rue1", 33700, "Mérignac");
			Patient patient2 = new Patient("Machin", "Bob", sdf1.parse("14/11/1999"), 18, "rue2", 33000, "Bordeaux");
			patient1.setEmail("truc@gmail.com");
			patient2.setEmail("bob@hotmail.fr");
			patient1.setIdentifiant("JPTruc");
			patient2.setIdentifiant("Bobbb");
			patient1.setMotDePasse("123456789");
			patient2.setMotDePasse("9876544321");
			patientRepo.save(patient1);
			patientRepo.save(patient2);
			Patient patient = new Patient();
			patientRepo.save(patient);
			

			

			Rdv rdv1 = new Rdv();
			Rdv rdv2 = new Rdv();
			rdv1.setPatient(patient1);
			rdv2.setPatient(patient2);
			rdvRepo.save(rdv1);
			rdvRepo.save(rdv2);
			Motif motif = new Motif();
			motifRepo.save(motif);

			Administrateur administrateur = new Administrateur();			
			adminRepo.save(administrateur);
			
			Rdv rdv = new Rdv();
			rdvRepo.save(rdv);
			
			Motif motifpat1 = new Motif("consultation", 20);
			Motif motifpat2 = new Motif("Carrie", 30);
			motifRepo.save(motifpat1);
			motifRepo.save(motifpat2);
			
			rdv1.setMotif(motifpat1);
			rdv2.setMotif(motifpat2);
			rdvRepo.save(rdv1);
			rdvRepo.save(rdv2);
			
			creneau1.setRdv(rdv1);
			creneau2.setRdv(rdv1);
			
			creneau10.setRdv(rdv2);
			creneau11.setRdv(rdv2);
			
			creneau1.setLieu(lieu1);
			creneau2.setLieu(lieu1);

			creneau10.setLieu(lieu2);
			creneau11.setLieu(lieu2);
			
			creneau1.setPraticien(praticien1);
			creneau2.setPraticien(praticien1);

			creneau10.setPraticien(praticien2);
			creneau11.setPraticien(praticien2);
			
			creneauRepo.save(creneau1);
			creneauRepo.save(creneau2);
			creneauRepo.save(creneau10);
			creneauRepo.save(creneau11);
			
			praticien1.getSpecialites().add(specialite1);
			praticien1.getMotifs().add(motifpat1);
			
			praticien2.getSpecialites().add(specialite3);
			praticien2.getMotifs().add(motifpat2);
			
			praticien1.getLieux().add(lieu1);
			praticien1.getLieux().add(lieu2);
			praticien1.getLieux().add(lieu3);
			praticienRepo.save(praticien1);

			praticien2.getLieux().add(lieu2);
			praticien2.getLieux().add(lieu4);
			praticienRepo.save(praticien2);

			motifpat1.getLieux().add(lieu1);
			motifpat1.getLieux().add(lieu3);
			motifRepo.save(motifpat1);
			
			motifpat2.getLieux().add(lieu1);
			motifpat2.getLieux().add(lieu2);
			motifRepo.save(motifpat2);



			
			




	}

}
