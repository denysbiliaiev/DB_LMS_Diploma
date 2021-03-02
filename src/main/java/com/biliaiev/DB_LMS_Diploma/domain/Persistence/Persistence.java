package com.biliaiev.DB_LMS_Diploma.domain.Persistence;

import java.util.HashMap;

public class Persistence<T> {

    private HashMap<Integer, T> entityMap = new HashMap<>();

    public HashMap<Integer, T> getEntities() {
        return entityMap;
    }

    public int getNewId(HashMap<Integer, T> itemMap) {
        int max = 0;

        for (Integer currentId: itemMap.keySet()) {
            if (currentId > max) {
                max = currentId;
            }
        }

        return ++max;
    }

    private Persistence() { };

    public static Persistence getInstance() {
        return PersistenceHolder.instance;
    }

    private static class PersistenceHolder {
        private static final Persistence instance = new Persistence();
    }
}
