package com.javarush.dao;

import com.javarush.entities.FilmText;
import org.hibernate.SessionFactory;

public class FilmTextDAO extends AbstractHibernateDao<FilmText> {

    public FilmTextDAO(SessionFactory sessionFactory) {
        super(FilmText.class,sessionFactory);
    }
}
