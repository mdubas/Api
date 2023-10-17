package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicos")
public class MedicoController {

    @PostMapping
    public void cadastrar(@RequestBody String json) {
        System.out.println(json); //request body para vincular a String ao corpo da requisição
    }
}
//no método acima é impresso o corpo da String, caso queira separar por atributo é necessário criar uma classe para isso.
