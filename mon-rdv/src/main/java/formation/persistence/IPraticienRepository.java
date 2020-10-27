package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Praticien;

public interface IPraticienRepository  extends JpaRepository<Praticien, Long>{

}
