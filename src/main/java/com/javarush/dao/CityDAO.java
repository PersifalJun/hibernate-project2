package com.javarush.dao;

import com.javarush.entities.City;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

public class CityDAO extends AbstractHibernateDao<City>{

    public CityDAO(SessionFactory sessionFactory) {
        super(City.class, sessionFactory);
    }

    public City getName(String name) {
        Query<City> query = getCurrentSession().createQuery("select c from City c  where c.city= :name",City.class);
        query.setParameter("name", name);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
