package com.biliaiev.DB_LMS_Diploma.dao;

import java.util.List;

public interface GenericDao<T> {
    List<T> getAll();

    T saveEntity(T item);

    T getEntity(int id);

    boolean updateEntity(T item);

    boolean deleteEntity(int id);
}
