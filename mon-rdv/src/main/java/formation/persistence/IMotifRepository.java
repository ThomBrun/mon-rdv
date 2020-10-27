package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Motif;

public interface IMotifRepository  extends JpaRepository<Motif, Long>{

}
