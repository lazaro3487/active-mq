package com.example.activemq.service;

import com.example.activemq.event.PersonEventPublisher;
import com.example.activemq.model.Person;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class PersonServiceImpl implements PersonService {

    private final PersonEventPublisher personEventPublisher;

    @Override
    public void save(Person person) {
        //That could be persisting a person to a BD
        log.info("Saving person -> " + person);

        //After persisting the person is possible to emit an event to notify the creation operation
        //By using an event the code is not related with the logic, allowing the listener interceptor to take care of different operations
        personEventPublisher.onCreatePerson(person);
    }
}
