package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;

public interface ILieuRepository  extends JpaRepository<Lieu, Long>{
	
	@Query("select c from Lieu l join l.creneaux c where c.lieu.id = :id")
	List<Creneau> findCreneauByLieu(@Param("id") Long id);

}
