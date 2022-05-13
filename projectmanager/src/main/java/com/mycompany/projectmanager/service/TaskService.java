package com.mycompany.projectmanager.service;


import com.mycompany.projectmanager.entities.Project;
import com.mycompany.projectmanager.entities.Task;
import com.mycompany.projectmanager.entities.TaskLog;
import com.mycompany.projectmanager.repo.TaskRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TaskService implements TaskRepo {

    private final TaskRepo taskRepo;
    private  final  ProjectService projectService;

    @Autowired
    public TaskService(TaskRepo taskRepo, ProjectService projectService){
        this.taskRepo = taskRepo;
        this.projectService = projectService;
    }


//    @Transactional(readOnly = true)
//    public List<Task> findAllTasksById(Integer idProject) {
//        return taskRepo.findAllById(Collections.singleton(idProject));
//    }


//    @Transactional(readOnly = true)
//    public List<Task> findAllTasksById(Integer idProject) {
//        return taskRepo.findAllById(idProject);
//    }


//    @Transactional(readOnly = true)
//    public List<Task> findAllTasksByProjectId(Task task) {
//        return taskRepo.findAllTasksByProjectId(task.getPojectId());
//    }

    public Task updateTask(Task task){
        return taskRepo.save(task);
    }


    @Override
    public Task save(Task task) {
        List <TaskLog> taskLogs = new ArrayList<>();
        Project project = this.projectService.findProjectById(task.getPojectId());
        task.setTaskLogs(taskLogs);
        task.setProject(project);
        return taskRepo.save(task);
    }

    public void deleteTask (Task task){
        taskRepo.deleteById(task.getIdTask());
    }

    public Task findTaskById(Integer idTask) {
        return taskRepo.findById(idTask).orElseThrow(()-> new IllegalStateException("Cette Tache n\'existe pas"));
    }

    @Override
    public List<Task> findAllTasksByProjectId(Integer idProject) {
        return taskRepo.findAllTasksByProjectId(idProject);
    }

//    @Override
//    public Task findTasksByProjectId(Integer idProject) {
//        return taskRepo.findTasksByProjectId(idProject);
//    }

    @Override
    public List<Task> findAll() {
        return taskRepo.findAll();
    }

    @Override
    public List<Task> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Task> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Task> findAllById(Iterable<Integer> integer) {
        return null;
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<Task> findById(Integer idTask) {
        return taskRepo.findById(idTask);
    }


    @Override
    public long count() {
        return taskRepo.count();
    }

    @Override
    public void deleteById(Integer idTask) {
        taskRepo.deleteById(idTask);
    }

//    public String deleteTaskById(Integer idTask) {
//        String result;
//        try {
//            taskRepo.deleteById(idTask);
//            result = "Tache supprimer avec succès";
//        }catch (Exception e){
//            result = "Tache non supprimer ";
//        }
//        return result;
//    }

    @Override
    public void delete(Task entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Task> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Task> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Task> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Task> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Task> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Task getOne(Integer integer) {
        return null;
    }

    @Override
    public Task getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Task> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Task> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Task> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Task> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Task> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Task, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

}
