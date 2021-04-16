package com.biliaiev.DB_LMS_Diploma.dao.impl;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.Persistence.Persistence;
import com.biliaiev.DB_LMS_Diploma.domain.PersistenceEntity;
import java.util.List;

public class Jdbc<T extends PersistenceEntity> implements GenericDao<T> {
    Persistence storage;

    public Jdbc() {
        this.storage = Persistence.getInstance();
    }

    @Override
    public List<T> getAll() {
        return null;
    }

    @Override
    public T saveEntity(T item) {
        return null;
    }

    @Override
    public T getEntity(int id) {
        return null;
    }

    @Override
    public boolean updateEntity(T item) {
        return false;
    }

    @Override
    public boolean deleteEntity(int id) {
        return false;
    }
}
