package com.example.activemq.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Person implements Serializable {

    public static final long serialVersionUID = -5081373089361370824L;

    private UUID uuid;
    private String firstName;
    private String lastName;
}
