package com.mycompany.projectmanager.web.controller;


import com.mycompany.projectmanager.entities.Project;
import com.mycompany.projectmanager.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/project")
public class ProjectController {

    private final ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @PostMapping("/addProject")
    public ResponseEntity<Project>addProject(@RequestBody Project project){
        Project project1 = projectService.save(project);
        return new  ResponseEntity<>(project1, HttpStatus.CREATED);
    }

    @GetMapping("/projectsList")
    public ResponseEntity<List<Project>> projectList(){
        List<Project> projects = projectService.findAll();
        return new ResponseEntity<>(projects, HttpStatus.OK);
    }

    @GetMapping("/projectsList/{idProject}")
    public ResponseEntity<Project> getProjectById(@PathVariable("idProject") Integer idProject){
        Project project = projectService.findProjectById(idProject);
        return new ResponseEntity<>(project, HttpStatus.OK);
    }


//    @GetMapping("/projectsSize")
//    public ResponseEntity<Long> projectSize(){
//        Long projSize = projectService.projectSize();
//        return new ResponseEntity<>(projSize,HttpStatus.OK);
//    }
    
//    @GetMapping("/projectsTaskSize")
//    public ResponseEntity<String> projectTaskSize(){
//        Long projTaskSize = projectRepo.projectTaskSize();
////        System.out.println("projTaskSize " +projTaskSize);
////        return "projTaskSize:" +projTaskSize;
//        return new ResponseEntity<>("projTaskSize " +projTaskSize,HttpStatus.OK);
//    }
}
