package ru.job4j.profession;

public class Doctor extends Profession {
    private String specialization;
    private Boolean healChildren;

    public String getSpecialization() {
        return specialization;
    }

    public boolean isHealChildren() {
        return false;
    }

    public static void main(String[] args) {
        Dentist mike = new Dentist();

        System.out.println(mike.getName());
    }
}
