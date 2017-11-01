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
    public String showForm (Model theModel) {

        //creating a new stockQuote object
        StockQuote stockQuote = new StockQuote();

        //adding stockQuote object as model attribute

        theModel.addAttribute("stock", stockQuote);

        return "stockquote-form";
    }


    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("stock") StockQuote stockQuote) throws IOException {

        Stock stock = YahooFinance.get(stockQuote.getSymbol());

        System.out.println("stockQuote" + stockQuote.getSymbol()) ;

        return "stockquoteResults";
    }
}
