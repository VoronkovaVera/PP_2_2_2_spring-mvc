package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(ModelMap model) {
        List<String> messages = new ArrayList<>();
        messages.add("Hello!");
        messages.add("It's a page with cars");
        messages.add("Nety poka nihera ");
        model.addAttribute("messages", messages);
        return "index";
    }

}