package uml.edu.benmorrisrains.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import uml.edu.benmorrisrains.dao.StockQuoteDAO;
import uml.edu.benmorrisrains.dao.StockQuoteDAOimpl;
import uml.edu.benmorrisrains.entity.StockQuote;
import uml.edu.benmorrisrains.service.StockService;

import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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
