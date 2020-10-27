package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Specialite;

public interface ISpecialiteRepository  extends JpaRepository<Specialite, Long>{

}
