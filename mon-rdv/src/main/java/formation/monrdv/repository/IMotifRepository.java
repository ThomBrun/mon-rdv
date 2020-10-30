package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;
import formation.monrdv.model.Motif;
import formation.monrdv.model.Rdv;

public interface IMotifRepository  extends JpaRepository<Motif, Long>{
	
	@Query("select r from Motif m join m.Rdvs r where r.motif.id = :id")
	List<Rdv> findRdvByMotif(@Param("id") Long id);
	
	@Query("select l from Lieu l join l.motifs m where m.id = :id")
	List<Lieu> findLieuByMotif(@Param("id") Long id);

	
}
