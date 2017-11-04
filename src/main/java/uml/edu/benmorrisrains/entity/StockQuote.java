package uml.edu.benmorrisrains.entity;

import uml.edu.benmorrisrains.model.StockData;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

/**
 * A container class that contains stock data.
 */

@Entity
@Table(name = "stock_quotes")
public class StockQuote extends StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "date")
    private Date date;

    @Column(name = "symbol")
    private String symbol;


    /**
     * Create a new instance of a StockQuote.
     *
     * @param price  the share price for the given date
     * @param date   the date of the share price
     * @param symbol the stock symbol.
     */
    public StockQuote(BigDecimal price, Date date, String symbol) {
        super();
        this.price = price;
        this.date = date;
        this.symbol = symbol;
    }

    public StockQuote() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return Get the share price for the given date.
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * @return The date of the share price
     */
    public Date getDate() {
        return date;
    }

    /**
     * @return The stock symbol.
     */
    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return "StockQuote{" +
                "id=" + id +
                ", price=" + price +
                ", date=" + date +
                ", symbol='" + symbol + '\'' +
                ", simpleDateFormat=" + simpleDateFormat +
                '}';
    }
}
