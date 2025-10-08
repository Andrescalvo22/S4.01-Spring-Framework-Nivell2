package cat.itacademy.s04.t01.n02.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {
    @GetMapping("/HelloWorld")
    public String sayHi(@RequestParam(defaultValue = "UNKNOWN") String name) {
        return "Hi " + name + ", you´re executing a Gradle Project";
    }

    @GetMapping(value = {"/HelloWorld2", "HelloWorld2/{name}"})
    public String sayHi2(@PathVariable(required = false) String name) {
        if (name == null) {
            name = "UNKNOWN";
        }
        return "Hi " + name + ", you´re executing a Gradle project";
    }
}
