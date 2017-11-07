package uml.edu.benmorrisrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uml.edu.benmorrisrains.entity.StockQuote;
import uml.edu.benmorrisrains.service.StockService;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/stockQuote")
public class StockQuoteController {

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


    @GetMapping("/index")
    public String setupForm(Map<String, Object> map){
        StockQuote stockQuote = new StockQuote();
        map.put("student", stockQuote);
        map.put("studentList", stockQuoteService.getStockQuotes());
        return "search";
    }

    @PostMapping("/doSearch")
    public String doActions(@ModelAttribute StockQuote stockQuote, Model theModel, String symbol) throws IOException {

        List<StockQuote> theQuote = stockQuoteService.searchQuotes(symbol);

        theModel.addAttribute("stockQuote", theQuote);

        return "search";

    }

}
