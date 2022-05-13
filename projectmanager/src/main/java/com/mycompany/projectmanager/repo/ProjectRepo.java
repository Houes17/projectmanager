package com.mycompany.projectmanager.repo;

import com.mycompany.projectmanager.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;

public interface ProjectRepo extends JpaRepository<Project,Integer> {

//    @Query(value = "SELECT * FROM project WHERE id_project = ?", nativeQuery = true)
//    List<Project> findAllByProjectId(Integer idProject);
//    @ElementCollection(fetch= FetchType.LAZY)
//    public List<Project>findAll();
//    public Long projectSize();
//    public Long projectTaskSize();
}
