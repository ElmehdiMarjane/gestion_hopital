package gestionhopital.elmehdimarjane.gestion_hopital.controllers;


import gestionhopital.elmehdimarjane.gestion_hopital.repositories.PatientRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller


public class PatientController {



    @GetMapping("/index")
    public String patient(){
        return "/patients";

    }


}
