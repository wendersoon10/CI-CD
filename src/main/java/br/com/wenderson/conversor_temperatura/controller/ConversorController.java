package br.com.wenderson.conversor_temperatura.controller;

import br.com.wenderson.conversor_temperatura.service.ConversorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversorController {

    private final ConversorService service;

    public ConversorController(ConversorService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String pagina (){
        return "index";
    }

    @PostMapping("/converter")
    public String converter(@RequestParam double temperatura,
                            @RequestParam String escala,
                            Model model){
        double resultado = service.converter(temperatura, escala);

        model.addAttribute("resultado", resultado);

        return "index";

    }
}
