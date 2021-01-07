package ru.job4j.profession;

public class Builder extends Engineer {
    private String favoriteMaterial;
    private String specialization;

    public Builder(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    private String favoriteMaterial(String any) {
        this.favoriteMaterial = any;
        return favoriteMaterial;
    }

    private String specialization(String any) {
        this.specialization = any;
        return specialization;
    }

    public static void main(String[] args) {
        Builder john = new Builder("James", "Li", "high", "09.09.1965");
        String material = john.favoriteMaterial("cement");
        String specialization = john.specialization("super boss");
        System.out.println(john.getName() + " works with " + material + ". His job is " + specialization);
    }
}
