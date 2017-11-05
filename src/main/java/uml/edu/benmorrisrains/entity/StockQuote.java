package uml.edu.benmorrisrains.entity;

import org.hibernate.search.annotations.Analyze;
import org.hibernate.search.annotations.Index;
import org.hibernate.search.annotations.Indexed;
import org.hibernate.search.annotations.Store;
import uml.edu.benmorrisrains.model.StockData;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Calendar;
import java.util.Date;

/**
 * A container class that contains stock data.
 */

@Entity
@Indexed
@Table(name = "stock_quotes")
public class StockQuote extends StockData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "price", nullable = false, length = 20)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private BigDecimal price;

    @Column(name = "date", nullable = false, length = 20)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private Date date;

    @Column(name = "symbol", nullable = false, length = 20)
    @org.hibernate.search.annotations.Field(index = Index.YES, analyze = Analyze.YES, store = Store.NO)
    private String symbol;


    public StockQuote() {}

    public StockQuote(String symbol, BigDecimal price, Date date) {
        super();
        this.price = price;
        this.date = date;
        this.symbol = symbol;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}
