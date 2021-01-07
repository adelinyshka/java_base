package ru.job4j.profession;

public class Profession {
    private String name;
    private String surname;
    private String education;
    private String birthday;

    public Profession() { }

    public Profession(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        this.name = anyName;
        this.surname = anySurname;
        this.education = anyEducation;
        this.birthday = anyBirthday;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getEducation() {
        return this.education;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public static void main(String[] args) {
        Profession sailor = new Profession("Mikel", "Smith", "high", "12.09.1987");
        System.out.println(sailor.getName());
    }
}
