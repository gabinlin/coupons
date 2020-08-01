package top.gabin.coupons.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.GetMapping;

@Primary
@FeignClient(value = "provider", fallback = HelloServiceError.class)
public interface HelloService {
    @GetMapping("/hello")
    String sayHello();
}
