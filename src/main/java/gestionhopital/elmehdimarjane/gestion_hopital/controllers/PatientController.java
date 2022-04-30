package gestionhopital.elmehdimarjane.gestion_hopital.controllers;


import gestionhopital.elmehdimarjane.gestion_hopital.entities.Patient;
import gestionhopital.elmehdimarjane.gestion_hopital.repositories.PatientRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {
private PatientRepository patientRepository;


    @GetMapping("/index")
    public String patient(Model model){
        List<Patient> patientList=patientRepository.findAll();
        model.addAttribute("ListPatient",patientList);
        return "/patients";

    }


}
