package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;
import formation.monrdv.model.Motif;
import formation.monrdv.model.Praticien;
import formation.monrdv.model.Rdv;
import formation.monrdv.model.Specialite;

public interface IPraticienRepository extends JpaRepository<Praticien, Long>{
	
	@Query("select s from Specialite s join s.praticiens p where p.id = :id")
	List<Specialite> findSpecialiteByPraticien(@Param("id") Long id);
	
	@Query("select l from Lieu l join l.praticiens p where p.id = :id")
	List<Lieu> findLieuByPraticien(@Param("id") Long id);
	
	@Query("select m from Praticien p join p.motifs m where m.praticien.id = :id")
	List<Motif> findMotifByPraticien(@Param("id") Long id);
	
	@Query("select c from Praticien p join p.creneaux c where c.praticien.id = :id")
	List<Creneau> findCreneauByPraticien(@Param("id") Long id);

}