package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Administrateur;

public interface IAdministrateurRepository extends JpaRepository<Administrateur, Long>{

}
