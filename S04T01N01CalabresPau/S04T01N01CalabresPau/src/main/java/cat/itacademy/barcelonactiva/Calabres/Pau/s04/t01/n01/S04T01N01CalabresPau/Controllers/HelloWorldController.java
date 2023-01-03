package cat.itacademy.barcelonactiva.Calabres.Pau.s04.t01.n01.S04T01N01CalabresPau.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }
    @GetMapping(value = { "/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable Optional<String> name){
        return "Hola, " + name + ". Estàs executant un projecte Maven";
    }

}
