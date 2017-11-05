package uml.edu.benmorrisrains.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import uml.edu.benmorrisrains.entity.StockQuote;
import uml.edu.benmorrisrains.service.StockService;

import java.util.Map;

@Controller
@RequestMapping("/stockQuote")
public class StockQuoteController {

    // inject StockService
    @Autowired
    private StockService stockQuoteService;

    @GetMapping("/index")
    public String setupForm(Map<String, Object> map){
        StockQuote stockQuote = new StockQuote();
        map.put("student", stockQuote);
        map.put("studentList", stockQuoteService.getStockQuotes());
        return "search";
    }

    @RequestMapping(value="/doSearch", method=RequestMethod.POST)
    public String doActions(@ModelAttribute StockQuote stockQuote, BindingResult result, @RequestParam String action,
                            Map<String,Object> map){
        StockQuote newStockQuote = new StockQuote();

        switch(action.toLowerCase()){
            case "search":
                StockQuote searchedQuote = stockQuoteService.searchQuotes(stockQuote.getSymbol());
                newStockQuote = searchedQuote!=null ? searchedQuote : new StockQuote();
                break;
        }
        map.put("stockQuote1", newStockQuote);
        map.put("stockQuoteList", stockQuoteService.getStockQuotes());
        return "search";

    }

}
