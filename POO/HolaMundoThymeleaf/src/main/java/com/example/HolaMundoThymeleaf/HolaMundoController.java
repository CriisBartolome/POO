package com.example.HolaMundoThymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HolaMundoController {

    @GetMapping("/")
    public String hola(){
        return "hola";
    }
}
