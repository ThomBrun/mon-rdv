package formation.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.monrdv.model.Patient;

public interface IPatientRepository  extends JpaRepository<Patient, Long>{

}
