package cat.itacademy.barcelonactiva.zolischipantasig.anderson.s04.t01.n02.S04T01N02.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hello, " + nom + ". You are running a Gradle project.";
    }

    @GetMapping(value = {"/HelloWorld2" , "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        if (nom == null) {
            return "Hello, You are running a Gradle project.";
        } else {
            return "Hello, " + nom + ". You are running a Gradle project.";
        }
    }
}
