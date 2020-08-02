package top.gabin.coupons.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
public class NotFoundController {

    @GetMapping("/notFound")
    public Mono<Map<String, String>> viewNotFound() {
        Map<String, String> data = new HashMap<>();
        data.put("code", "404");
        data.put("data", "not found");
        return Mono.just(data);
    }

}
