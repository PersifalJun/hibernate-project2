package com.javarush.dao;

import com.javarush.entities.Film;
import org.hibernate.SessionFactory;

public class FilmDAO extends AbstractHibernateDao<Film>{

    public FilmDAO(SessionFactory sessionFactory) {
        super(Film.class, sessionFactory);
    }
}
