package com.mycompany.projectmanager.service;

import com.mycompany.projectmanager.entities.Company;
import com.mycompany.projectmanager.entities.Project;
import com.mycompany.projectmanager.entities.Task;
import com.mycompany.projectmanager.repo.ProjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


@Service
public class ProjectService implements ProjectRepo {

    private final ProjectRepo projectRepo;
    private final  CompanyService companyService;

    @Autowired
    public ProjectService(ProjectRepo projectRepo, CompanyService companyService){
        this.projectRepo = projectRepo;
        this.companyService = companyService;
    }

    @Override
    public List<Project> findAll() {
        return projectRepo.findAll();
    }

    @Override
    public List<Project> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Project> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Project> findAllById(Iterable<Integer> integers) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Integer integer) {

    }

    @Override
    public void delete(Project entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Project> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public Project save(Project project) {
        List <Task> taskList = new ArrayList<>();
        Company company = this.companyService.findCompanyById(project.getCompanyId());
        project.setTaskList(taskList);
        project.setCompany(company);
        return projectRepo.save(project);
    }

    @Override
    public <S extends Project> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Project> findById(Integer integer) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Integer integer) {
        return false;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Project> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Project> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Project> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Project getOne(Integer integer) {
        return null;
    }

    @Override
    public Project getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Project> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Project> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Project> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Project> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Project> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Project> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Project, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

//    @Override
    public Project findProjectById(Integer idProject) {
        return projectRepo.findById(idProject).orElseThrow(()-> new IllegalStateException("Le"));
    }
}
