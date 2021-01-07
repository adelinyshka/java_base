package ru.job4j.profession;

public class Programmer extends Engineer {
    private String favoriteOS;
    private String mainLanguage;

    public Programmer(String anyName, String anySurname, String anyEducation, String anyBirthday) {
        super(anyName, anySurname, anyEducation, anyBirthday);
    }

    public void setFavoritOS(String any) {
        this.favoriteOS = any;
    }

    public String getFavoriteOS() {
        return favoriteOS;
    }

    public String setMainLanguage(String any) {
        this.mainLanguage = any;
        return any;
    }

    public static void main(String[] args) {
        Programmer mrBlack = new Programmer(
                "Lenny",
                "Black",
                "school",
                "09.11.2000");
        mrBlack.setFavoritOS("Lunix");
        String lang = mrBlack.setMainLanguage("PHP");
        String os = mrBlack.getFavoriteOS();
        String name = mrBlack.getName();
        String education = mrBlack.getEducation();

        System.out.println(name + " usually develops with " + lang + " & fond of " + os + ". He studied IT only in " + education + ".");
    }
}
