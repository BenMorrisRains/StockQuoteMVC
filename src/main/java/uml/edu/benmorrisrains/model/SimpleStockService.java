package uml.edu.benmorrisrains.model;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

public class SimpleStockService implements StockService {

    public StockQuote getQuote(String symbol) throws IOException {
        StockQuote stockQuote = null;
        try {
            Stock stock = YahooFinance.get(symbol);
            BigDecimal price = stock.getQuote().getPrice();
            Calendar from = Calendar.getInstance();
            Calendar to = Calendar.getInstance();
            Interval interval = Interval.DAILY;
            stockQuote = new StockQuote(symbol, from, to, interval );
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
        return stockQuote;
    }

}
