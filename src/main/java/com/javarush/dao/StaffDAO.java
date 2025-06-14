package com.javarush.dao;

import com.javarush.entities.Staff;
import org.hibernate.SessionFactory;

public class StaffDAO extends AbstractHibernateDao<Staff>{

    public StaffDAO(SessionFactory sessionFactory) {
        super(Staff.class, sessionFactory);
    }
}
