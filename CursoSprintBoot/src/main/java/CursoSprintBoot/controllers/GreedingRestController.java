package CursoSprintBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreedingRestController {

    @GetMapping("/saludo/{name}")
    public String Greeding(@PathVariable String name){

        return "hola "+ name;
    }
}
