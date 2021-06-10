package com.example.activemq.schedule;

import com.example.activemq.model.Person;
import com.example.activemq.service.PersonService;
import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@AllArgsConstructor
public class PersonSchedule {

    private final PersonService personService;

    @Scheduled(fixedRate = 2000)
    public void createPeron() {
        //Example of person creation. That could be like a controller
        Person person = Person.builder()
                .uuid(UUID.randomUUID())
                .firstName("FirstName")
                .lastName("LastName")
                .build();

        personService.save(person);
    }
}
