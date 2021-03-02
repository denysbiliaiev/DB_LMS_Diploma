package com.biliaiev.DB_LMS_Diploma.dao;

import java.util.List;

public interface GenericDao<T> {
    List<T> getAll();

    T saveItem(T item);

    T getItem(int id);

    boolean updateItem(T item);

    boolean deleteItem(int id);
}
