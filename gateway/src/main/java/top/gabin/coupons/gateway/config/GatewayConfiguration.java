package top.gabin.coupons.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Mono;

@Configuration
public class GatewayConfiguration {

    @Bean
    public KeyResolver ipKeyResolver() {
        // 根据IP地址限流
        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
    }
}
