package com.javarush.dao;

import com.javarush.entities.City;
import org.hibernate.SessionFactory;

public class CityDAO extends AbstractHibernateDao<City>{

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }
}
