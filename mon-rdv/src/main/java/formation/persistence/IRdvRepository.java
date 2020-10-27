package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Rdv;

public interface IRdvRepository  extends JpaRepository<Rdv, Long>{

}
