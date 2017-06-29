package com.springdatarest.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by mac on 6/29/17.
 */
@Data
@Entity
public class Tenant {
    private
    @Id
    @GeneratedValue
    Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private String country;
    private String state;
}
