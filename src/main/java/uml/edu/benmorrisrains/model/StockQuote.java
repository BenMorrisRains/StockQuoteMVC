package uml.edu.benmorrisrains.model;

import yahoofinance.histquotes.Interval;

import java.util.Calendar;
import java.util.Date;

import java.math.BigDecimal;
import java.util.Date;

/**
 * A container class that contains stock data.
 */
public class StockQuote extends StockData {

    private String symbol;
    private Calendar from;
    private Calendar to;
    private Interval interval;


    /**
     * Create a new instance of a StockQuote.
     *
     * @param price  the share price for the given date
     * @param date   the date of the share price
     * @param symbol the stock symbol.
     */

    public StockQuote() {
    }

    public StockQuote(String symbol, Calendar from, Calendar to, Interval interval) {
        super();
        this.symbol = symbol;
        this.from = from;
        this.to = to;
        this.interval = interval;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Calendar getFrom() {
        return from;
    }

    public void setFrom(Calendar from) {
        this.from = from;
    }

    public Calendar getTo() {
        return to;
    }

    public void setTo(Calendar to) {
        this.to = to;
    }

    public Interval getInterval() {
        return interval;
    }

    public void setInterval(Interval interval) {
        this.interval = interval;
    }
}
