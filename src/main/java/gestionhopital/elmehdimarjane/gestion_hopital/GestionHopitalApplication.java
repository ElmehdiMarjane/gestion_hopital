package gestionhopital.elmehdimarjane.gestion_hopital;

import gestionhopital.elmehdimarjane.gestion_hopital.entities.Patient;
import gestionhopital.elmehdimarjane.gestion_hopital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class GestionHopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {
        SpringApplication.run(GestionHopitalApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Patient 1",new Date(),true,40));
        patientRepository.save(new Patient(null,"Patient 2",new Date(),false,80));
        patientRepository.save(new Patient(null,"Patient 3",new Date(),true,55));
        List<Patient> patientList= patientRepository.findAll();
        patientList.forEach(p->{
            System.out.println("-----------------------------------------------------------");
            System.out.println(p.getId());
            System.out.println(p.getNom());
            System.out.println(p.getDateNaissance());
            System.out.println(p.getScore());
            System.out.println(p.isMalade());
            System.out.println("-----------------------------------------------------------");
        });
    }
}
