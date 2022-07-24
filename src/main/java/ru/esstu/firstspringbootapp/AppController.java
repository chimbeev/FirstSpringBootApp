package ru.esstu.firstspringbootapp;
//As we are developing a Spring Boot web application, we need to have a controller class to handle requests from
// the clients. Create the AppController class with the following initial code:
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private SalesDAO dao;//The key point here is an instance of the SalesDAO class will be created and injected
    // automatically by Spring. Then in the handler methods we will invoke its CRUD methods.

    // handler methods go here...
    @RequestMapping("/")
    public String viewHomePage(Model model) {
        List<Sale> listSale = dao.list();
        model.addAttribute("listSale", listSale);
        return "index";
    }
}
