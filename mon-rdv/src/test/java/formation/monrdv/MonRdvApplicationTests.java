package formation.monrdv;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Rdv;
import formation.monrdv.repository.ICreneauRepository;
import formation.monrdv.repository.IRdvRepository;

@SpringBootTest
class MonRdvApplicationTests {

	@Autowired
	private ICreneauRepository creneauRepo;
	
	@Autowired
	private IRdvRepository rdvRepo;
	
	@Test
	void contextLoads() {
			Rdv rdv = new Rdv();
			
			rdvRepo.save(rdv);
			
			Creneau creneau1 = new Creneau();
			
			rdv.getCreneaux().add(creneau1); // ignorer par hibernate
			
			creneau1.setRdv(rdv);
			
			creneauRepo.save(creneau1);
	}

}
