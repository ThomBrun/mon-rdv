package formation.monrdv.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import formation.monrdv.model.Creneau;
import formation.monrdv.model.Lieu;
import formation.monrdv.model.Rdv;

public interface IRdvRepository  extends JpaRepository<Rdv, Long>{
	
	/*@Query("from Itineraire i where i.moyenDeTransport.fournisseur.nom = :nom")
	@Query("select r from Client c join c.reservations r where c.identifiant = :identifiant and r.expiree = TRUE")
	@Query("select r from Motif m join m.Rdvs r where c.identifiant = :identifiant and r.expiree = TRUE")
	@Query(value = "SELECT transport_means.type_of_transport, reservation.arrival_time, reservation.total_time, reservation.total_amount FROM itinerary JOIN reservation ON itinerary.reservation_id = reservation.id JOIN user_account ON reservation.client_id = user_account.id JOIN transport_means ON itinerary.transport_means_id = transport_means.id WHERE reservation.client_id = ? ORDER BY arrival_time desc", nativeQuery = true)*/
	
	//@Query(value = "SELECT r FROM Rdv JOIN motif ON r.motif_id = motif.id JOIN praticien ON motif.praticien_id = praticien.id JOIN creneau ON creneau.rdv_id = r.id WHERE creneau.date = ajd ORDER BY arrival_time desc", nativeQuery = true)
	
	/*@Query(value = "SELECT r FROM r.Rdv JOIN motif ON r.motif_id = motif.id JOIN praticien ON motif.praticien_id = praticien.id JOIN creneau ON creneau.rdv_id = r.id ORDER BY arrival_time desc", nativeQuery = true)
	List<Rdv> findRdvByPraticien(@Param("id") Long id);*/
	

	
	/* Marche aussi dans IPatient
	@Query("select r from Patient p join p.rdvs r where r.patient.id = :id")   
	List<Rdv> findRdvByPatient(@Param("id") Long id);*/

	
	@Query("select c from Rdv r join r.creneaux c where c.rdv.id = :id")
	List<Creneau> findCreneauByRdv(@Param("id") Long id);

}
