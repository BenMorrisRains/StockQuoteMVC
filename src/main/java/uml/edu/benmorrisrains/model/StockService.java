package uml.edu.benmorrisrains.model;

import java.io.IOException;

public interface StockService {


    StockQuote getQuote(String symbol) throws IOException;


}
