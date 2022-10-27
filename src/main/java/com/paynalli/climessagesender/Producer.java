package com.paynalli.climessagesender;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;

@Component
public class Producer {

    @Autowired
    private ConnectionFactory connectionFactory;

    public void sendMessage(String message) {

        CamelContext context = new DefaultCamelContext();

        ProducerTemplate template = context.createProducerTemplate();

        template.sendBody("jms:second?connectionFactory=#connectionFactory", message);
    }


}
