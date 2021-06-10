package com.example.activemq.event;

import com.example.activemq.sender.PersonSender;
import lombok.AllArgsConstructor;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonEventListener {

    private final PersonSender personSender;

    @EventListener(PersonEvent.class)
    public void onCreatePerson(PersonEvent personEvent) {
        //Listen to creation event and then passes the person to the queue
        personSender.sendPerson(personEvent.getPerson());
    }
}
