package com.mycompany.projectmanager.service;
import com.mycompany.projectmanager.entities.TaskLog;
import com.mycompany.projectmanager.repo.TaskLogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Service
public class TaskLogService implements TaskLogRepo {

    private final TaskLogRepo taskLogRepo;

    @Autowired
    public TaskLogService(TaskLogRepo taskLogRepo){
        this.taskLogRepo = taskLogRepo;
    }

    @Override
    public List<TaskLog> findAll() {
        return taskLogRepo.findAll();
    }

    @Override
    public List<TaskLog> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<TaskLog> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<TaskLog> findAllById(Iterable<Integer> integers) {
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
    public void delete(TaskLog entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends TaskLog> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends TaskLog> S save(S entity) {
        return null;
    }

    @Override
    public <S extends TaskLog> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<TaskLog> findById(Integer integer) {
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
    public <S extends TaskLog> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends TaskLog> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<TaskLog> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public TaskLog getOne(Integer integer) {
        return null;
    }

    @Override
    public TaskLog getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends TaskLog> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends TaskLog> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends TaskLog> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends TaskLog> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends TaskLog> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends TaskLog> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends TaskLog, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
