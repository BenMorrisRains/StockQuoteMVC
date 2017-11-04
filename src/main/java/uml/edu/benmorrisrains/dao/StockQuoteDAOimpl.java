package uml.edu.benmorrisrains.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uml.edu.benmorrisrains.entity.StockQuote;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class StockQuoteDAOimpl implements StockQuoteDAO {




    //I need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;


   @Transactional
    public List<StockQuote> getStockQuote() {

       // I need to get the current hibernate session
       Session currentSession = sessionFactory.getCurrentSession();

       // create a query

       Query<StockQuote> theQuery = currentSession.createQuery("from StockQuote", StockQuote.class);

       // execute query and get result list
        List<StockQuote> stockQuotes = theQuery.getResultList();

       // return list of stock quotes

       return stockQuotes;
    }
}
