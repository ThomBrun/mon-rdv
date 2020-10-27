package formation.monrdv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;
import formation.monrdv.model.Praticien;
import formation.monrdv.model.Rdv;
import formation.monrdv.repository.ICreneauRepository;
import formation.monrdv.repository.ILieuRepository;
import formation.monrdv.repository.IPraticienRepository;
import formation.monrdv.repository.IRdvRepository;

@SpringBootTest
class MonRdvApplicationTests {

	@Autowired
	private ICreneauRepository creneauRepo;
	
	@Autowired
	private IRdvRepository rdvRepo;
	
	/*@Autowired
	private IPraticienRepository praticienRepo;
	
	@Autowired
	private ILieuRepository lieuRepo;
	
	@Autowired
	private IPatientRepository patientRepo;

	@Autowired
	private ISpecialiteRepository specialiteRepo;

	@Autowired
	private IUtilisateurRepository utilisateurRepo;

	@Autowired
	private IMotifRepository motifRepo;

	@Autowired
	private IAdministrateurRepository administrateurRepo;*/

	
	@Test
	void contextLoads() {
		
		
			Rdv rdv = new Rdv();
			rdvRepo.save(rdv);
			
			/*Praticien praticien = new Praticien();
			praticienRepo.save(praticien);
			
			Lieu lieu = new Lieu();
			lieuRepo.save(lieu);
			
			Patient patient = new Patient();
			patientRepo.save(patient);

			Specialite specialite = new Specialite();
			specialiteRepo.save(specialite);

			Utilisateur utilisateur = new utilisateur();
			utilisateurRepo.save(utilisateur);

			Motif motif = new Motif();
			motifRepo.save(motif);

			Administrateur administrateur = new Administrateur();			
			administrateurRepo.save(administrateur);
			*/

			Creneau creneau1 = new Creneau();
			
			//rdv.getCreneaux().add(creneau1); // ignoré par hibernate, maître = creneau, esclave = rdv
			
			creneau1.setRdv(rdv);
			
			creneauRepo.save(creneau1);
	}

}
