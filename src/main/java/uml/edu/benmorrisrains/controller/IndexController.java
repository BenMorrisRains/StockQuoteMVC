
package uml.edu.benmorrisrains.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controller for index.jsp
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String showPage () {
        return "index";
    }
}