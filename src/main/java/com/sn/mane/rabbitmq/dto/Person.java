package com.sn.mane.rabbitmq.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    private String firstName;
    private String lastName;
}
