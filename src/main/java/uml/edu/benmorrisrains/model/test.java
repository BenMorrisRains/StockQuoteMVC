package uml.edu.benmorrisrains.model;

import java.io.IOException;

public class test {

    public static void main(String[] args) throws IOException {

        StockService stockService = YahooStockServiceFactory.getYahooStockService();

        StockQuote stockQuote = stockService.getQuote("GOOG");

        System.out.println(stockQuote);
    }
}
