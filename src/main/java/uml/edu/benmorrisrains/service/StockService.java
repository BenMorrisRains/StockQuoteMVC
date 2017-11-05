package uml.edu.benmorrisrains.service;

import uml.edu.benmorrisrains.entity.StockQuote;

import java.util.List;

public interface StockService {


    public List<StockQuote> getStockQuotes();

    StockQuote searchQuotes(String symbol);
}
