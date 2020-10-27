package formation.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import formation.model.Lieu;

public interface ILieuRepository  extends JpaRepository<Lieu, Long>{

}
