package com.javarush.dao;

import com.javarush.entities.Rental;
import org.hibernate.SessionFactory;

public class RentalDAO extends AbstractHibernateDao<Rental>{

    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class,sessionFactory);
    }
}
