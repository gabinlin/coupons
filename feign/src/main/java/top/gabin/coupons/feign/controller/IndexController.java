package top.gabin.coupons.feign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import top.gabin.coupons.feign.service.HelloService;

import javax.annotation.Resource;

@RestController
public class IndexController {
    @Resource
    private HelloService helloService;

    @GetMapping("/index")
    public String viewIndex() {
        return helloService.sayHello();
    }
}
