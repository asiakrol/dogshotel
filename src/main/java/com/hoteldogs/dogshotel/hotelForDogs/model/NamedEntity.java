package com.hoteldogs.dogshotel.hotelForDogs.model;


import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class NamedEntity extends BaseEntity{

    @Column (name = "name")
    private String name;
}
