package gestionhopital.elmehdimarjane.gestion_hopital.controllers;


import gestionhopital.elmehdimarjane.gestion_hopital.entities.Patient;
import gestionhopital.elmehdimarjane.gestion_hopital.repositories.PatientRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class PatientController {



    private PatientRepository patientRepository;


    @GetMapping("/index")
    public String patient(Model model,
                          @RequestParam(name = "page",defaultValue = "0") int page,
                          @RequestParam(name = "size",defaultValue = "10")int size,
                          @RequestParam(name = "Keyword",defaultValue = "")String Kw

    ){
        Page<Patient> patientPage=patientRepository.findByNomContains(Kw,PageRequest.of(page, size));
        model.addAttribute("ListPatient",patientPage);
        model.addAttribute("Pages",new int[patientPage.getTotalPages()]);
        model.addAttribute("CurrentPage",page);
        model.addAttribute("Keyword",Kw);
        return "/patients";

    }


    @GetMapping("/delete")
    public String delete(@RequestParam(name = "id",defaultValue = "0") Long id,
                         @RequestParam(name = "page",defaultValue = "")int page,
                         @RequestParam(name = "Keyword",defaultValue = "")String Kw){
        patientRepository.deleteById(id);

        return "redirect:/index?page="+page+"&Keyword="+Kw;

    }
    @GetMapping("/")
    public String Home(){


        return "redirect:/index";

    }


}
