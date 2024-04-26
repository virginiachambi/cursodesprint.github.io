package CursoSprintBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWordRestControllers {
    @GetMapping({"/hello","/hola","/virginia"})// forma de acceder por el host

    public String helloWorld(){
        System.out.println("Solicitud ejecutada...");
        return "Hola a todos las personas que estan viendo mi página, quiro darles la Bienvenida a todos con el mensaje " +
                "felididades bebe has sido hackeado...  " +
                "load ... 100%";
    }
}
