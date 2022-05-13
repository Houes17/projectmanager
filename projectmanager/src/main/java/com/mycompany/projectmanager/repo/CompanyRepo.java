package com.mycompany.projectmanager.repo;

import com.mycompany.projectmanager.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CompanyRepo extends JpaRepository<Company,Integer> {
//    public List<Company>findAll();
//    public Long companiesSize();
}
