package ru.job4j.profession;

public class Surgeon extends Doctor {
    private String placeOfStudy;
    private int numberOfCertificates;

    public Surgeon(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    public void setPlaceOfStudy(String placeOfStudy) {
        this.placeOfStudy = placeOfStudy;
    }

    public void setNumberOfCertificates(int numberOfCertificates) {
        this.numberOfCertificates = numberOfCertificates;
    }

    public String getPlaceOfStudy() {
        return placeOfStudy;
    }

    public int getNumberOfCertificates() {
        return numberOfCertificates;
    }

    public static void main(String[] args) {
        Surgeon mrDenver = new Surgeon(
                "Ken",
                "Denver",
                "university",
                "04.07.1978");

        mrDenver.setPlaceOfStudy("University of Canada");
        mrDenver.setNumberOfCertificates(7);

        System.out.println(
                mrDenver.getName()
                        + " studied in "
                        + mrDenver.getPlaceOfStudy()
                        + " and got "
                        + mrDenver.getNumberOfCertificates()
                        + " certificates.");
    }
}
