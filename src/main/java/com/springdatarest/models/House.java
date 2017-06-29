package com.springdatarest.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

/**
 * Created by mac on 6/29/17.
 */
@Data
@Entity
public class House {

    private
    @Id
    @GeneratedValue
    Long id;
    private String Address;
    private String country;
    private HouseType houseType;
    @OneToMany
    private List<Filez> imageFiles;

}
