package com.javarush.dao;


import com.javarush.entities.Category;
import org.hibernate.SessionFactory;

public class CategoryDAO extends AbstractHibernateDao<Category>{

    public CategoryDAO(SessionFactory sessionFactory) {
        super(Category.class, sessionFactory);
    }
}
