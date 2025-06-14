package com.javarush.dao;

import com.javarush.entities.Country;
import org.hibernate.SessionFactory;

public class CountryDAO extends AbstractHibernateDao<Country>{

    public CountryDAO(SessionFactory sessionFactory) {
        super(Country.class, sessionFactory);
    }
}
