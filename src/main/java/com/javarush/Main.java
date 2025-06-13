package com.javarush;

import com.javarush.config.PropertiesSessionFactoryProvider;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    private PropertiesSessionFactoryProvider provider = new PropertiesSessionFactoryProvider();
    private SessionFactory sessionFactory = provider.getSessionFactory();


    public static void main(String[] args) {
        Main main = new Main();
        main.workWithSession();
    }

    public void workWithSession(){
        Session session = sessionFactory.openSession();
    }

}