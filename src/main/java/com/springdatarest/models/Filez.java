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
public class Filez {

    private
    @Id
    @GeneratedValue
    Long id;
    private String imageContent;
    private String imageType;
}
