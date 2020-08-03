package top.gabin.coupns.zipkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/hello")
    public String viewHello() {
        return "Hello World";
    }

}
