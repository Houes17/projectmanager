package com.mycompany.projectmanager.web.controller;


import com.mycompany.projectmanager.entities.Company;
import com.mycompany.projectmanager.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/company")

public class CompanyController {

    private final CompanyService companyService;

    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }


    @GetMapping("/companiesList")
    public ResponseEntity<List<Company>> listeComp(){
        List<Company> companies = companyService.findAll();
        return new ResponseEntity<>(companies,HttpStatus.OK);
    }
    
//    @CrossOrigin(origins = "*")
//    @GetMapping("/companiesList")
//    public ResponseEntity<List<Company>> listeComp(){
//        List<Company> companies = CompanyRepo.findAll();
//        return new ResponseEntity<>(companies,HttpStatus.OK);
//    }    
    

//    @CrossOrigin(origins = "*")
//    @GetMapping("/companiesSize")
//    public ResponseEntity<Long> compSize(){
//        Long compSize = companyRepo.companiesSize();
//        return new ResponseEntity<>(compSize,HttpStatus.OK);
//    }


    /*@GetMapping("/Companies")
    public ResponseEntity<List<Company>> listeComp(){
        List<Company>companies = companyRepo.findAll();
        return new ResponseEntity<>(companies,HttpStatus.OK);
    }*/
    /*
    @GetMapping("/Company")
    public List<Company> listeComp(){

        return (List<Company>) companyRepo.findAll();
    }*/

    /*@GetMapping("/Company")
    public Result <Company> getAllCompanies(){
        boolean sucees = true;
        List<Company> companies = (List<Company>) companyService.findAll("jackdev");
        return new Result <Company>(sucees, (Company) companies);
    }*/

}
