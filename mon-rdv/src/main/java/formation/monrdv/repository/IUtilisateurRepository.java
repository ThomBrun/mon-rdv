package formation.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.monrdv.model.Utilisateur;

public interface IUtilisateurRepository  extends JpaRepository<Utilisateur, Long>{

}
