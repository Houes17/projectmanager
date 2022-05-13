
package com.mycompany.projectmanager.repo;
import com.mycompany.projectmanager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface TaskRepo extends JpaRepository<Task, Integer>{
    @Query(value = "SELECT * FROM task WHERE id_project = ?", nativeQuery = true)
    List<Task> findAllTasksByProjectId(Integer idProject);


//    @Query(value = "SELECT * FROM task WHERE id_project = ?", nativeQuery = true)
//    Task findTasksByProjectId(Integer idProject);
//    public List<Task>findAll();
//    public Long taskSize();
//    public void saveTask();
//    public Result<Task> store(
//            Integer idTask,
//            Integer idProject,
//            String taskName,
//            String actionUsername);
}
