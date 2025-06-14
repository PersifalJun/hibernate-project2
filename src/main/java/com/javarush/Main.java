package com.javarush;

import com.javarush.config.PropertiesSessionFactoryProvider;
import com.javarush.config.SessionFactoryProvider;
import com.javarush.dao.*;
import com.javarush.entities.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class Main {

    private SessionFactoryProvider provider;
    private SessionFactory sessionFactory;

    private final ActorDAO actorDAO;
    private final AddressDAO addressDAO;
    private final CategoryDAO categoryDAO;
    private final CityDAO cityDAO;
    private final CountryDAO countryDAO;
    private final CustomerDAO customerDAO;
    private final FilmDAO filmDAO;
    private final FilmTextDAO filmTextDAO;
    private final InventoryDAO inventoryDAO;
    private final LanguageDAO languageDAO;
    private final PaymentDAO paymentDAO;
    private final RentalDAO rentalDAO;
    private final StaffDAO staffDAO;
    private final StoreDAO storeDAO;

    public Main(PropertiesSessionFactoryProvider provider, SessionFactory sessionFactory) {
        this.provider = provider;
        this.sessionFactory = sessionFactory;

        actorDAO = new ActorDAO(sessionFactory);
        addressDAO = new AddressDAO(sessionFactory);
        categoryDAO = new CategoryDAO(sessionFactory);
        cityDAO = new CityDAO(sessionFactory);
        countryDAO = new CountryDAO(sessionFactory);
        customerDAO = new CustomerDAO(sessionFactory);
        filmDAO = new FilmDAO(sessionFactory);
        filmTextDAO = new FilmTextDAO(sessionFactory);
        inventoryDAO = new InventoryDAO(sessionFactory);
        languageDAO = new LanguageDAO(sessionFactory);
        paymentDAO = new PaymentDAO(sessionFactory);
        rentalDAO = new RentalDAO(sessionFactory);
        staffDAO = new StaffDAO(sessionFactory);
        storeDAO = new StoreDAO(sessionFactory);
    }

    public static void main(String[] args) {
        PropertiesSessionFactoryProvider provider = new PropertiesSessionFactoryProvider();
        Main main = new Main(provider, provider.getSessionFactory());
        main.workWithSession();
    }

    public void workWithSession(){
        Session session = sessionFactory.openSession();
    }

}