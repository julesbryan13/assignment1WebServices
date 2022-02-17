package com.example.restservice.modelAssignment1;

public class Phone {
    private int countryCode;
    private int provinceCode;
    private int theRestOfTheNumber;

    public Phone() {
    }

    public Phone(int countryCode, int provinceCode, int theRestOfTheNumber) {
        this.countryCode = countryCode;
        this.provinceCode = provinceCode;
        this.theRestOfTheNumber = theRestOfTheNumber;
    }

    public int getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getTheRestOfTheNumber() {
        return theRestOfTheNumber;
    }

    public void setTheRestOfTheNumber(int theRestOfTheNumber) {
        this.theRestOfTheNumber = theRestOfTheNumber;
    }
}