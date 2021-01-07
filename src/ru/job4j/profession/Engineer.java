package ru.job4j.profession;

public class Engineer extends Profession {
    private int yearsOfExperience;

    public Engineer(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public static void main(String[] args) {
        Engineer software = new Engineer(
                "John",
                "Milkovich",
                "university",
                "2.04.1966");
        System.out.println(software.getName());
        software.setYearsOfExperience(20);
        System.out.println(software.getYearsOfExperience());
    }
}
