package com.example.restservice.modelAssignment1;

public class Address {
    private int number;
    private String streetName;
    private String city;
    private String province;

    public Address() {
    }

    public Address(int number, String streetName, String city, String province) {
        this.number = number;
        this.streetName = streetName;
        this.city = city;
        this.province = province;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}