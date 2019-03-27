package in.diszhappy.shopper.home.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
    	System.out.println("Coming to MVC controller");
        return "upload.html";
    }
    
    @GetMapping("/home")
    public String home(Model model) {
    	System.out.println("Coming to MVC controller");
        return "index";
    }

}