package com.javarush.dao;


import com.javarush.entities.Address;
import org.hibernate.SessionFactory;

public class AddressDAO extends AbstractHibernateDao<Address>{
    public AddressDAO(SessionFactory sessionFactory) {
        super(Address.class, sessionFactory);
    }
}
