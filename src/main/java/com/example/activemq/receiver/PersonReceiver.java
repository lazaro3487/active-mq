package com.example.activemq.receiver;

import com.example.activemq.config.JmsQueue;
import com.example.activemq.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import javax.jms.Message;

@Component
@AllArgsConstructor
@Slf4j
public class PersonReceiver {

    @JmsListener(destination = JmsQueue.PERSON_QUEUE)
    public void receivePerson(@Payload Person person, @Headers MessageHeaders messageHeaders, Message message) {
        log.info("Receiving Message -> " + person);
        log.info("Headers" + messageHeaders);
        log.info("Message " + message);
    }
}
