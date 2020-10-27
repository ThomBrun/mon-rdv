package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Utilisateur;

public interface IUtilisateurRepository  extends JpaRepository<Utilisateur, Long>{

}
