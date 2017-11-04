package uml.edu.benmorrisrains.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import uml.edu.benmorrisrains.entity.StockQuote;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {

        // create session factory
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(StockQuote.class)
                .buildSessionFactory();

        // create session
        Session session = factory.getCurrentSession();

    }
}
