package com.biliaiev.DB_LMS_Diploma.dao.InMemoryImpl;

import com.biliaiev.DB_LMS_Diploma.dao.GenericDao;
import com.biliaiev.DB_LMS_Diploma.domain.PersistenceEntity;
import com.biliaiev.DB_LMS_Diploma.domain.Persistence.Persistence;

import java.util.*;

public class InMemoryDaoImpl<T extends PersistenceEntity> implements GenericDao<T> {
    Persistence storage;

    public InMemoryDaoImpl() {
        this.storage = Persistence.getInstance();
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<T>(storage.getEntities().values());
    }

    public T saveEntity(T item) {
        int id = storage.getNewId(storage.getEntities());
        item.setId(id);
        storage.getEntities().put(id, item);
        return item;
    }

    @Override
    public T getEntity(int id) {
        return (T) storage.getEntities().get(id);
    }

    @Override
    public boolean updateEntity(T entity) {
        int id = entity.getId();
        Map<Integer, T> groups = storage.getEntities();

        if (groups.containsKey(id)) {
            groups.put(id, entity);
            return true;
        }

        return false;
    }

    @Override
    public boolean deleteEntity(int id) {
        HashMap<Integer, T> groups = storage.getEntities();

        if (groups.containsKey(id)) {
            groups.remove(id);
            return true;
        }

        return false;
    }
}
