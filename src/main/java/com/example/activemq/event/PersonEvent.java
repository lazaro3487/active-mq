package com.example.activemq.event;

import com.example.activemq.model.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PersonEvent {
    private final Person person;
}
