package edu.wctc.springdatajpa.controller;

import edu.wctc.springdatajpa.service.ShirtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShirtController {
    private ShirtService shirtService;

    @Autowired
    public ShirtController(ShirtService shi) {
        this.shirtService = shi;

    }

    @RequestMapping("/inventory")
    public String showCreditsPage(Model model) {
        model.addAttribute("pageTitle", "About");
        model.addAttribute("shirtList", shirtService.getShirtList());
        return "inventory";
    }
}




