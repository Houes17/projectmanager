package com.mycompany.projectmanager.repo;

public interface GenericDAO <T,ID>{
    public T find(ID id);
    public void persist(T obj);
    public T merge(T obj);
    public void remove(T obj);
}
