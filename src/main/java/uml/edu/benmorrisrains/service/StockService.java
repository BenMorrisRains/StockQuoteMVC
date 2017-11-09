package uml.edu.benmorrisrains.service;

import uml.edu.benmorrisrains.entity.StockQuote;

import java.sql.Date;
import java.text.ParseException;
import java.util.List;

/**
 * StockService interface
 */
public interface StockService {


    public List<StockQuote> getStockQuotes();

    List<StockQuote> searchQuotes(String symbol, String fromDate, String untilDate) throws ParseException;
}
