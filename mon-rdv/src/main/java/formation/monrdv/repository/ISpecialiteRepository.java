package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Specialite;

public interface ISpecialiteRepository  extends JpaRepository<Specialite, Long>{

	@Query(value = "SELECT s FROM Specialite s where s.nom = :nom")
	List<Specialite> findSpecialiteBynom(@Param("nom") String nom);

}
