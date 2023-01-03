package cat.itacademy.barcelonactiva.Calabres.Pau.s04.t01.n02.S04T01N02CalabresPau.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String name){
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }
    @GetMapping(value = { "/HelloWorld2", "/HelloWorld2/{name}"})
    public String saluda2(@PathVariable Optional<String> name){
        return "Hola, " + name + ". Estàs executant un projecte Gradle";
    }

}
