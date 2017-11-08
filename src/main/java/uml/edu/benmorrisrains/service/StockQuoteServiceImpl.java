package uml.edu.benmorrisrains.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import uml.edu.benmorrisrains.dao.StockQuoteDAO;
import uml.edu.benmorrisrains.entity.StockQuote;
import javax.transaction.Transactional;
import java.util.List;

/**
 * Service class.
 */

@Service
@EnableTransactionManagement
public class StockQuoteServiceImpl implements StockService {

    @Autowired // injecting our StockQuoteDAO
    private StockQuoteDAO stockQuoteDAO;

    @Override
    @Transactional // handles DB transactions at the service level
    public List<StockQuote> getStockQuotes() {
        return stockQuoteDAO.getStockQuote();
    }

    @Override
    @Transactional
    public List<StockQuote> searchQuotes(String symbol) {
        return stockQuoteDAO.searchQuotes(symbol);
    }


}

