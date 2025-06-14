package com.javarush.dao;

import com.javarush.entities.Actor;
import org.hibernate.SessionFactory;

public class ActorDAO extends AbstractHibernateDao<Actor> {

    public ActorDAO(SessionFactory sessionFactory) {
        super(Actor.class, sessionFactory);
    }
}
