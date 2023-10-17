package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //para comunicar que o SpringMVC é uma classe controller
@RequestMapping("/hello") //qual URL o controller vai responder, neste caso será o Hello.
public class HelloController {

    @GetMapping //o método do protocolo HTTP é para chamar está método
    public String olaMundo(){
        return "Hello World!";
    }
}
