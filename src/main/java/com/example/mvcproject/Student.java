package com.example.mvcproject;

import java.util.HashMap;
import java.util.LinkedHashMap;

//Step two creating a student controller class
public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String[] OperatingSystem;
    private LinkedHashMap<String, String> countryOptions;
    private String favoriteLanguage;

    public Student() {
        countryOptions = new LinkedHashMap<>();
        countryOptions.put("BR", "Brazil");
        countryOptions.put("FR", "Franc");
        countryOptions.put("CM", "Cameroon");
        countryOptions.put("IN", "India");
        countryOptions.put("BE", "Belgium");

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LinkedHashMap<String, String> getCountryOptions() {
        return countryOptions;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }

    public String[] getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String[] operatingSystem) {
        OperatingSystem = operatingSystem;
    }
}

