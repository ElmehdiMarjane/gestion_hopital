package gestionhopital.elmehdimarjane.gestion_hopital.repositories;

import gestionhopital.elmehdimarjane.gestion_hopital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository< Patient, Long> {

}
