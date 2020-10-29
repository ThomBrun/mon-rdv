package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Lieu;
import formation.monrdv.model.Praticien;
import formation.monrdv.model.Specialite;

public interface IPraticienRepository  extends JpaRepository<Praticien, Long>{
	
	/*@Query("select s from Specialite s join s.praticiens p where p.id = :id")
	List<Specialite> findSpecialiteByPraticien(@Param("id") Long id);
	
	@Query("select l from Lieu l join l.praticiens p where p.id = :id")
	List<Lieu> findLieuByPraticien(@Param("id") Long id);*/

}