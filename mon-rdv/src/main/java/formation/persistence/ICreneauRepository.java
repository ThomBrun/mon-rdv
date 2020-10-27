package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Creneau;

public interface ICreneauRepository extends JpaRepository<Creneau, Long>{

}
