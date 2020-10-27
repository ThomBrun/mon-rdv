package formation.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.monrdv.model.Rdv;

public interface IRdvRepository  extends JpaRepository<Rdv, Long>{

}
