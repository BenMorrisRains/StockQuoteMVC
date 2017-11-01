package uml.edu.benmorrisrains.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;

@Controller
@RequestMapping("/stockQuote")
public class StockServiceController {

    @RequestMapping("/showForm")
    public String showForm (Model theModel, String symbol) throws IOException {

        //creating a new stockQuote object

        StockService stockService = YahooStockServiceFactory.getYahooStockService();

        StockQuote stockQuote = stockService.getQuote("GOOG");

        //adding stockQuote object as model attribute

        theModel.addAttribute("stock", stockQuote);

        return "stockquote-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("stock") StockQuote stock){

        System.out.println(stock);
        return "stockquoteResults";
    }
}
