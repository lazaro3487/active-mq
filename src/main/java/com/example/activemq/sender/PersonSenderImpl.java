package com.example.activemq.sender;

import com.example.activemq.config.JmsQueue;
import com.example.activemq.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class PersonSenderImpl implements PersonSender {

    private final JmsTemplate jmsTemplate;

    @Override
    public void sendPerson(Person person) {
        log.info("Sending -> " + person);
        jmsTemplate.convertAndSend(JmsQueue.PERSON_QUEUE, person);
    }
}
