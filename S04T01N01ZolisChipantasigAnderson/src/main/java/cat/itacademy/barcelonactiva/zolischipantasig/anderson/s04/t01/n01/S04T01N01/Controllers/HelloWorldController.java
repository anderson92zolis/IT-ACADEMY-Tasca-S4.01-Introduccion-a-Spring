package cat.itacademy.barcelonactiva.zolischipantasig.anderson.s04.t01.n01.S04T01N01.Controllers;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/HelloWorld")
    public String saluda(@RequestParam(defaultValue = "UNKNOWN") String nom) {
        return "Hello, " + nom + ". You are running a Maven project.";
    }

    @GetMapping(value = {"/HelloWorld2" , "/HelloWorld2/{nom}"})
    public String saluda2(@PathVariable(required = false) String nom) {
        if (nom == null) {
            return "Hello, You are running a Maven project.";
        } else {
            return "Hello, " + nom + ". You are running a Maven project.";
        }
    }
}