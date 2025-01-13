package huy.module4course03.controller;

import huy.module4course03.model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/")
public class IndexController {

    @GetMapping("")
    public String index() {
        return "redirect:/customers";
    }
}
