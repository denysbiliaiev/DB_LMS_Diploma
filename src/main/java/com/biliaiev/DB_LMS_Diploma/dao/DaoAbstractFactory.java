package com.biliaiev.DB_LMS_Diploma.dao;

import com.biliaiev.DB_LMS_Diploma.dao.impl.InMemory;
import com.biliaiev.DB_LMS_Diploma.dao.impl.Jdbc;

public class DaoAbstractFactory<T> {
    DaoType daoType;


    public DaoAbstractFactory(DaoType daoType) {
        this.daoType = daoType;
    }

    public GenericDao<T> createDao() {
        GenericDao<T> genericDao = null;

        if (DaoType.IN_MEMORY.equals(daoType)) {
            genericDao = new InMemory();
        }

        if (DaoType.JDBC.equals(daoType)) {
            genericDao = new Jdbc();
        }

        return genericDao;
    }


}
