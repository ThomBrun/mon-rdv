package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Patient;

public interface IPatientRepository  extends JpaRepository<Patient, Long>{

}
