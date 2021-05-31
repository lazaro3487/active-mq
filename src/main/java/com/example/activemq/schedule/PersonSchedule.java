package com.example.activemq.schedule;

import com.example.activemq.model.Person;
import com.example.activemq.sender.PersonSender;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PersonSchedule {

    private final PersonSender personSender;

    @Scheduled(fixedRate = 2000)
    public void sendPerson() {
        Person person = Person.builder()
                .uuid(UUID.randomUUID())
                .firstName("FirstName")
                .lastName("LastName")
                .build();

        personSender.sendPerson(person);
    }
}
