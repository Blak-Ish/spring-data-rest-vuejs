package com.springdatarest.leadway;


import lombok.Data;

import javax.persistence.*;

/**
 * Created by rasaq on 22/01/2017.
 */
@Data
@Entity
public class Employee {

    private
    @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String description;

    private Employee() {
    }

    public Employee(String firstName, String lastName, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
    }
}
