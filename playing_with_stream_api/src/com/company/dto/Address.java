package com.company.dto;

public class Address {

    String city;
    int zipcode;

    public Address(String city, int zipcode) {
        this.city = city;
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public int getZipcode() {
        return zipcode;
    }
}
