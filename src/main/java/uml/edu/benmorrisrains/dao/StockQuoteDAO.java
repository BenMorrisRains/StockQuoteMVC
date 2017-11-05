package uml.edu.benmorrisrains.dao;

import uml.edu.benmorrisrains.entity.StockQuote;

import java.util.List;

public interface StockQuoteDAO {

    List<StockQuote> getStockQuote();

    StockQuote searchQuotes(String symbol);
}
