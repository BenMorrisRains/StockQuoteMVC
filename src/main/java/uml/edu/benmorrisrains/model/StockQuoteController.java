package uml.edu.benmorrisrains.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import uml.edu.benmorrisrains.dao.StockQuoteDAO;
import uml.edu.benmorrisrains.entity.StockQuote;

import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/stockQuote")
public class StockQuoteController {

    // need to inject the stock quote dao
    //Autowired: Spring will scan for a component that implements StockQuoteDAO interface

    @Autowired
    private StockQuoteDAO stockQuoteDAO;


    @RequestMapping("/list")
    public String listStocks (Model theModel) throws IOException {

        // get the quotes form the dao
        List<StockQuote> theQuote = stockQuoteDAO.getStockQuote();

        // add the customers to the model
        theModel.addAttribute("stockQuote", theQuote);



       return "list-stocks";

        //creating a new stockQuote object



        //adding stockQuote object as model attribute




    }


  /*  @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("stock") StockQuote stock){

        System.out.println(stock);
        return "stockquoteResults";
    }*/
}
