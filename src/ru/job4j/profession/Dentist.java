package ru.job4j.profession;

public class Dentist extends Doctor {
    private int yearsOfExperience;
    private String placeOfJob;

    public Dentist(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    public String setPlaceOfJob(String any) {
        this.placeOfJob = any;
        return any;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public String getPlaceOfJob() {
        return placeOfJob;
    }

    public static void main(String[] args) {
        Dentist mrSmith = new Dentist(
                "Andrew",
                "Smith",
                "university",
                "23.09.1988");
        String specialization = mrSmith.setSpecialization("child care");
        mrSmith.isHealChildren(true);
        mrSmith.setPlaceOfJob("school");
        String jobPlace = mrSmith.getPlaceOfJob();

                System.out.println(
                mrSmith.getName()
                        + " was born at "
                        + mrSmith.getBirthday()
                        + ". He works at "
                        + jobPlace
                        + " as dentis, his specialization is "
                        + specialization + ". ");
    }
}
