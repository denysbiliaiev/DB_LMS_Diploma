package com.biliaiev.DB_LMS_Diploma.dao.factory;

import com.biliaiev.DB_LMS_Diploma.dao.DaoType;

public class DaoAbstractFactory {
    DaoType daoType;

    public DaoAbstractFactory(DaoType daoType) {
        this.daoType = daoType;
    }
}
