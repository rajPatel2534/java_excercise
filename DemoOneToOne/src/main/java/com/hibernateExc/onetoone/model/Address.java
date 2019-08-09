package com.hibernateExc.onetoone.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;

/**
 *
 * @author raj
 */

@Embeddable
public class Address {

    @Column(name = "street", length = 20)
    private String street;

    @Column(name = "city", length = 15)
    private String city;

    @Column(name = "state", length = 15)
    private String state;
    
    @Column(name = "county", length = 15)
    private String county;


    public Address() {
    }

    public Address( String street, String street2, String city, String state, String county) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.county = county;
    }

    public String getStreet1() {
        return street;
    }

    public void setStreet1(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
    
}
