package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(420);
        int dollar = Converter.rubleToDollar(420);
        System.out.println("420 rubles are " + euro + " euro.");
        System.out.println("420 rubles are " + dollar + " dollars.");

        // tests
        int in = 420;
        int expected = 6;
        int out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("420 rubles are 6 euro. Test result: " + passed);

        in = 420;
        expected = 7;
        out = Converter.rubleToDollar(in);
        passed = expected == out;
        System.out.println("420 rubles are 7 dollars. Test result: " + passed);
    }
}
