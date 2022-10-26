package com.paynalli.climessagesender;

import org.apache.camel.CamelContext;
import org.apache.camel.ProducerTemplate;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.jms.ConnectionFactory;

@SpringBootApplication
public class CliMessageSenderApplication {




	static CamelContext camelContext = new DefaultCamelContext();


	public static void main(String[] args) throws Exception {
		SpringApplication.run(CliMessageSenderApplication.class, args);

		camelContext.start();
		ProducerTemplate template = camelContext.createProducerTemplate();




		for (int i = 0; i < 10; i++) {
			template.sendBody("jms:first-timer", "Test Message: " + i);
		}


	}

}
