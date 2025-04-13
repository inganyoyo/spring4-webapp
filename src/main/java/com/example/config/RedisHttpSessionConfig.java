package com.example.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.HttpSessionStrategy;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 1800) // 세션 만료 시간 = 30분
public class RedisHttpSessionConfig {

    @Bean
    public HttpSessionStrategy httpSessionStrategy() {
        // 쿠키 이름을 TESTSESSION으로 설정하기
        CookieHttpSessionStrategy strategy = new CookieHttpSessionStrategy();
        strategy.setCookieName("TESTSESSION"); // 커스텀 쿠키 이름 지정
        return strategy;
    }
}