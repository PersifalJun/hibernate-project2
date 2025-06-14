package com.javarush.dao;

import com.javarush.entities.Language;
import org.hibernate.SessionFactory;

public class LanguageDAO extends AbstractHibernateDao<Language>{

    public LanguageDAO(SessionFactory sessionFactory) {
        super(Language.class, sessionFactory);
    }
}
