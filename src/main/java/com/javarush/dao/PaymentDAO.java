package com.javarush.dao;

import com.javarush.entities.Payment;
import org.hibernate.SessionFactory;

public class PaymentDAO extends AbstractHibernateDao<Payment>{

    public PaymentDAO(SessionFactory sessionFactory) {
        super(Payment.class, sessionFactory);
    }
}
