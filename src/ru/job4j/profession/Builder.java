package ru.job4j.profession;

public class Builder extends Engineer {
    private String favoriteMaterial;
    private String specialization;

    private void favoriteMaterial(String any) {
        this.favoriteMaterial = any;
    }

    private void specialization(String any) {
        this.specialization = any;
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getFavoriteMaterial() {
        return favoriteMaterial;
    }

    public static void main(String[] args) {
        Builder john = new Builder();
        john.favoriteMaterial("cement");
        System.out.println(john.getFavoriteMaterial());
    }
}
