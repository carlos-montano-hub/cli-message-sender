package com.paynalli.climessagesender;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class CliRouter extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        from("timer:first-timer").transform().constant(LocalDateTime.now()).to("log:first-timer");

    }
}
