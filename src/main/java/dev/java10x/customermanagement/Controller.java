package dev.java10x.customermanagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/welcome")
    public String welcome() {
        return "This is the first message on this route.";
    }

}
