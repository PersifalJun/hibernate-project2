package com.javarush.dao;

import com.javarush.entities.Store;
import org.hibernate.SessionFactory;

public class StoreDAO extends AbstractHibernateDao<Store>{

    public StoreDAO(SessionFactory sessionFactory) {
        super(Store.class,sessionFactory);
    }
}
