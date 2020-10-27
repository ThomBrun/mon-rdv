package formation.monrdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.monrdv.model.Motif;

public interface IMotifRepository  extends JpaRepository<Motif, Long>{

}
