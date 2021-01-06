package ru.job4j.profession;

public class Engineer extends Profession {
    private int yearsOfExperience;
    private String favoriteLanguage;

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
}
