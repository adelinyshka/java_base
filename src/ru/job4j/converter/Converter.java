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

        int in2 = 420;
        int expected2 = 7;
        int out2 = Converter.rubleToDollar(in2);
        boolean passed2 = expected2 == out2;
        System.out.println("420 rubles are 7 dollars. Test result: " + passed2);
    }
}
