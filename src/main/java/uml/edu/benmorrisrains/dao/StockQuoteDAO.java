package uml.edu.benmorrisrains.dao;

import uml.edu.benmorrisrains.entity.StockQuote;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

/**
 * DAO interface.
 */
public interface StockQuoteDAO {

    List<StockQuote> getStockQuote();

    List<StockQuote> searchQuotes(String symbol, String fromDate, String untilDate) throws ParseException;
}
