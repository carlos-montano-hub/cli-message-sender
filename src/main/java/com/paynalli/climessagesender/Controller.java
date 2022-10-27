package com.paynalli.climessagesender;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    CamelContext context;

    @GetMapping("/")
    public String sendMessage(@RequestParam(defaultValue = "Hello World") String message) {

        ProducerTemplate template = context.createProducerTemplate();

        template.sendBody("jms:second", message);

        return "Message sent";
    }







}
