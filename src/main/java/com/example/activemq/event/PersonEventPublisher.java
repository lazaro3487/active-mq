package com.example.activemq.event;

import com.example.activemq.model.Person;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonEventPublisher {

    private final ApplicationEventPublisher eventPublisher;

    public void onCreatePerson(Person person) {
        eventPublisher.publishEvent(PersonEvent
                .builder()
                .person(person)
                .build()
        );
    }
}
