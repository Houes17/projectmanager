/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.projectmanager.repo.impl;

import com.mycompany.projectmanager.repo.UserRepo;
import com.mycompany.projectmanager.entities.User;
import java.util.List;
import javax.persistence.NoResultException;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("userRepo")
@Transactional
public class UserRepoImpl extends GenericDAOImpl<User, String> implements UserRepo {

    public UserRepoImpl() {
        super(User.class);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public List<User> findAll() {
        return em.createNamedQuery("User.findAll").getResultList();
    }

    @Override
    @Transactional(readOnly = true, propagation
            = Propagation.SUPPORTS)
    public User findByUsernameAndPassword(String username, String password) {
        List<User> users = em.createNamedQuery("User.findByUsernameAndPassword")
                .setParameter("username", username)
                .setParameter("password", password)
                .getResultList();
        return (users.size() == 1 ? users.get(0) : null);
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByUsername(String username) {
        return (User) em.createNamedQuery("User.findByUsername")
                .setParameter("username", username)
                .getSingleResult();
    }

    @Override
    @Transactional(readOnly = true, propagation = Propagation.SUPPORTS)
    public User findByEmail(String email) {
        User user = null;
        try {
            user = (User) em.createNamedQuery("User.findByEmail")
                    .setParameter("email", email)
                    .getSingleResult();
        } catch (NoResultException nre) {
            System.out.println(nre);
        }
        return user;
    }

}
