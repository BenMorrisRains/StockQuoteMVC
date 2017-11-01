package uml.edu.benmorrisrains.model;

public class YahooStockServiceFactory {


    public YahooStockServiceFactory() {
    }

    public static SimpleStockService getYahooStockService() {
        return new SimpleStockService();
    }
}
