package uml.edu.benmorrisrains.controller;

import org.hibernate.validator.constraints.pl.REGON;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import uml.edu.benmorrisrains.entity.StockQuote;
import uml.edu.benmorrisrains.service.StockService;
import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

/**
 * This is my main controller that controls the entire application.
 */
@Controller
@RequestMapping("/stockQuote")
public class StockQuoteController {

    /**
     * listStocks method lists all the stocks in the database.
     */
    // inject StockService
    @Autowired
    private StockService stockQuoteService;

    @RequestMapping("/list")
    public String listStocks (Model theModel) throws IOException {

        // get the quotes form the dao
        List<StockQuote> theQuote = stockQuoteService.getStockQuotes();

        // add the customers to the model
        theModel.addAttribute("stockQuote", theQuote);
        return "list-stocks";

    }

    /**
     *
     * simple index page that maps to the index.jsp which redirects to search.jsp
     */


    @GetMapping("/index")
    public String index() {
        return "search";
    }

    /**
     * Form controller.
     *
     * @param stockQuote
     * @param theModel
     * @param symbol
     * @return
     * @throws IOException
     */

    @PostMapping("/doSearch")
    public String doActions(@ModelAttribute StockQuote stockQuote, Model theModel,
                            @ModelAttribute("searchText") String symbol, @RequestParam("fromDate")String fromDate,
                            @RequestParam("untilDate") String untilDate) throws IOException, ParseException {

        List<StockQuote> theQuote = stockQuoteService.searchQuotes(symbol, fromDate, untilDate);
        theModel.addAttribute("stockQuote", theQuote);

        return "search";

    }

}
