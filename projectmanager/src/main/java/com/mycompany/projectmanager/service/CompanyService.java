package com.mycompany.projectmanager.service;

import com.mycompany.projectmanager.entities.Company;
import com.mycompany.projectmanager.repo.CompanyRepo;
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
public class CompanyService implements CompanyRepo {

    private final CompanyRepo companyRepo;

    @Autowired
    public CompanyService(CompanyRepo companyRepo) {
        this.companyRepo = companyRepo;
    }

    public Company findCompanyById(Integer idCompany) {
        return companyRepo.findById(idCompany).orElseThrow(()-> new IllegalStateException("Cette company n\'existe pas"));
    }

    @Override
    public List<Company> findAll() {
        return companyRepo.findAll();
    }

    @Override
    public List<Company> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Company> findAll(Pageable pageable) {
        return null;
    }

    @Override
    public List<Company> findAllById(Iterable<Integer> integers) {
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
    public void delete(Company entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Integer> integers) {

    }

    @Override
    public void deleteAll(Iterable<? extends Company> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public <S extends Company> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Company> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Company> findById(Integer integer) {
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
    public <S extends Company> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Company> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Company> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Integer> integers) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Company getOne(Integer integer) {
        return null;
    }

    @Override
    public Company getById(Integer integer) {
        return null;
    }

    @Override
    public <S extends Company> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Company> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Company> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Company> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Company> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Company> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Company, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }
}
