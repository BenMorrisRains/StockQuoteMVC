package uml.edu.benmorrisrains.model;

import uml.edu.benmorrisrains.entity.StockQuote;

import java.io.IOException;

public interface StockService {


    StockQuote getQuote(String symbol) throws IOException;


}
