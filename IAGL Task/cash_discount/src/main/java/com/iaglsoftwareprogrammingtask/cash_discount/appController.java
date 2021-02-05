package com.iaglsoftwareprogrammingtask.cash_discount;


import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class appController {
    
    @GetMapping("/british_airways")
    public String flightInput(Model model){
        inputHandler input_Handler = new inputHandler();
        model.addAttribute("inputHandler", input_Handler);
        return "flightInput";
    }

    @PostMapping("/british_airways")
    public String payment(@ModelAttribute("inputHandler") inputHandler input_Handler) {
        System.out.println(input_Handler);
        return "payment"; 
    } 


    
    
}
