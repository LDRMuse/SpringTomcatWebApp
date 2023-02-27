package com.springdemo.mvc.models;

import java.util.LinkedHashMap;

public class Student {

    private String firstName;
    private String lastName;
    private String country;
    private String favoriteLanguage;

    private LinkedHashMap<String, String> favoriteLanguageOptions;

    public Student() {
        // populate favorite language options

        favoriteLanguageOptions = new LinkedHashMap<String, String>();

        // parameter order: value, display label
        favoriteLanguageOptions.put("Java", "Java");
        favoriteLanguageOptions.put("C#", "C#");
        favoriteLanguageOptions.put("PHP", "PHP");
        favoriteLanguageOptions.put("Ruby", "Ruby");
    };

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCountry() {
        return country;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public LinkedHashMap<String, String> getFavoriteLanguageOptions() {
        return favoriteLanguageOptions;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
}
