package formation.monrdv.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.fasterxml.jackson.annotation.JsonView;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Rdv;
import formation.monrdv.model.Views;
import formation.monrdv.repository.IRdvRepository;

@RestController
@RequestMapping("/rdv")
@CrossOrigin("*")
public class RdvRestController {

	@Autowired
	private IRdvRepository rdvRepo;
	
	@GetMapping("")
	@JsonView(Views.ViewRdv.class)
	public List<Rdv> findAll() {
		return rdvRepo.findAll();
	}
	
	@GetMapping("/{id}")
	@JsonView(Views.ViewRdv.class)
	public Rdv find(@PathVariable Long id) {

		Optional<Rdv> optRdv = rdvRepo.findById(id);

		if (optRdv.isPresent()) {
			return optRdv.get();
		} else {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}
	}
	
	@GetMapping("/creneaux/{id}")
	@JsonView(Views.ViewRdv.class)
	public List<Creneau> findCreneauByRdv(@PathVariable Long id) {
		return rdvRepo.findCreneauByRdv(id);
	}
	
	@PostMapping("")
	public Rdv create(@RequestBody Rdv rdv) {
		rdv = rdvRepo.save(rdv);

		return rdv;
	}
	
	@PutMapping("/{id}")
	public Rdv update(@RequestBody Rdv rdv, @PathVariable Long id) {
		if (!rdvRepo.existsById(id)) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Unable to find resource");
		}

		rdv = rdvRepo.save(rdv);

		return rdv;
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		rdvRepo.deleteById(id);
	}
}
