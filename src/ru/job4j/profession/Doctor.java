package ru.job4j.profession;

public class Doctor extends Profession {
    private String specialization;

    public Doctor(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    public String setSpecialization(String any) {
        this.specialization = any;
        return any;
    }

    public String getSpecialization() {
        return specialization;
    }

    public boolean isHealChildren(boolean bool) {
        return bool;
    }

    public static void main(String[] args) {
        Dentist mike = new Dentist(
                "Mike",
                "Minecraft",
                "school",
                "03.04.1990");
        boolean mikehealer = mike.isHealChildren(true);
        String mikeSpecialisation = mike.setSpecialization("child health");
        System.out.println(
                "Does " + mike.getName() + " heal children?"
                + System.lineSeparator()
                + mikehealer
                + System.lineSeparator()
                + "And his specialization is: " + mikeSpecialisation);
    }
}
