package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Lieu;

public interface ILieuRepository  extends JpaRepository<Lieu, Long>{
	
	@Query("select l from Lieu l join l.praticiens p where p.id = :id")
	List<Lieu> findLieuByPraticien(@Param("id") Long id);

}
