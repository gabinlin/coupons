package top.gabin.coupons.service.provider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/hello")
    String hello() {
        return "Hello" + ":" + port;
    }
}
