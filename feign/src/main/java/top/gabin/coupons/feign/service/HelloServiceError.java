package top.gabin.coupons.feign.service;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceError implements HelloService {
    @Override
    public String sayHello() {
        return "系统故障，稍候片刻";
    }
}
