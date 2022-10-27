package com.paynalli.climessagesender;

import org.apache.activemq.artemis.jms.client.ActiveMQConnectionFactory;
import org.apache.camel.component.jms.JmsComponent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;

@Configuration
public class ApplicationConfig {

//    @Bean
//    public JmsComponent jmsComponent() throws JMSException {
//        // Create the connectionfactory which will be used to connect to Artemis
//        ActiveMQConnectionFactory cf = new ActiveMQConnectionFactory();
//        cf.setBrokerURL("tcp://localhost:61616");
//        cf.setUser("admin");
//        cf.setPassword("admin");
//
//        // Create the Camel JMS component and wire it to our Artemis connectionfactory
//        JmsComponent jms = new JmsComponent();
//        jms.setConnectionFactory(cf);
//        return jms;
//    }

}
