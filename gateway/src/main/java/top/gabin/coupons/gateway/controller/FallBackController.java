package top.gabin.coupons.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

@RestController
public class FallBackController {

    @GetMapping("/fallback")
    public Mono<Map<String, String>> viewFallback() {
        Map<String, String> data = new HashMap<>();
        data.put("code", "100");
        data.put("data", "Service Not Available");
        return Mono.just(data);
    }

}
