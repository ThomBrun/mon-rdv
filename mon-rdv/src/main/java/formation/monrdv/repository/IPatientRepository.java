package formation.monrdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Patient;
import formation.monrdv.model.Rdv;

public interface IPatientRepository  extends JpaRepository<Patient, Long>{
	
	@Query("select r from Patient p join p.rdvs r where r.patient.id = :id")
	List<Rdv> findRdvByPatient(@Param("id") Long id);

}
