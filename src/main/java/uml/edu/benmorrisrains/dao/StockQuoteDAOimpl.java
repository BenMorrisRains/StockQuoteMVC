package uml.edu.benmorrisrains.dao;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import uml.edu.benmorrisrains.entity.StockQuote;

;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * This is where I implement the StockQuoteDAO interface and
 * where all the logic is located. This is where I start the Hibernate session.
 */

@Repository
public class StockQuoteDAOimpl implements StockQuoteDAO {

    //I need to inject the session factory
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<StockQuote> getStockQuote() {

        // I need to get the current hibernate session
        Session currentSession = sessionFactory.getCurrentSession();

        // create a query

        Query<StockQuote> theQuery = currentSession.createQuery("from StockQuote order by symbol", StockQuote.class);

        // execute query and get result list
        List<StockQuote> stockQuotes = theQuery.getResultList();

        // return list of stock quotes

        return stockQuotes;
    }


    @Override
    public List<StockQuote> searchQuotes(String symbol, String fromDate, String untilDate) throws ParseException {


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date startDate = sdf.parse(fromDate);
        Date endDate = sdf.parse(untilDate);

        String hql = "from StockQuote s where s.symbol = :stockSymbol AND date between :fromDate and :untilDate order by date";

        Session currentSession = sessionFactory.getCurrentSession();
        sessionFactory.openSession();

        Query<StockQuote> theQuery = currentSession.createQuery(hql,
                StockQuote.class).setParameter("stockSymbol", symbol).setParameter("fromDate", startDate)
                .setParameter("untilDate", endDate);

        List<StockQuote> stockQuotes = theQuery.getResultList();

        System.out.println(stockQuotes);



        return stockQuotes;

    }



}
