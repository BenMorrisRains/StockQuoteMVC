package uml.edu.benmorrisrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uml.edu.benmorrisrains.dao.StockQuoteDAO;
import uml.edu.benmorrisrains.entity.StockQuote;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class StockQuoteServiceImpl implements StockService {

    @Autowired // injecting our StockQuoteDAO
    private StockQuoteDAO stockQuoteDAO;

    @Transactional // handles DB transactions at the service level
    public List<StockQuote> getStockQuotes() {
        return stockQuoteDAO.getStockQuote();
    }

    @Override
    public StockQuote searchQuotes(String symbol) {
        return stockQuoteDAO.searchQuotes(symbol);
    }

}

