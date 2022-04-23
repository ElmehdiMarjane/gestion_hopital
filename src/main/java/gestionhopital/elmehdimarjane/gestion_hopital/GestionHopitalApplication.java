package gestionhopital.elmehdimarjane.gestion_hopital;

import gestionhopital.elmehdimarjane.gestion_hopital.entities.Patient;
import gestionhopital.elmehdimarjane.gestion_hopital.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

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
        for(int i=0;i<100;i++){
            patientRepository.save(new Patient(null,"Patient "+i,new Date(),true, (int) (Math.random() * 100)));

        }


        Page<Patient> patientList= patientRepository.findAll(PageRequest.of(3,5));
        System.out.println(patientList.getTotalPages());
        System.out.println(patientList.getTotalElements());
        System.out.println(patientList.getNumber());
        List<Patient> content=patientList.getContent();
        content.forEach(p->{
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
