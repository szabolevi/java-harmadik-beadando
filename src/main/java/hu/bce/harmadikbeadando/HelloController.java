package hu.bce.harmadikbeadando;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private String template = "Hello, %s!";

    @GetMapping("/hello")
    public Hello greeting(@RequestParam(value = "name", defaultValue = "Felhasznalo") String name) {
        return new Hello(String.format(template, name));
    }
}