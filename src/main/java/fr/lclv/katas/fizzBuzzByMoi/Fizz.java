package fr.lclv.katas.fizzBuzzByMoi;

class Fizz {

    private static final String FIZZ = "Fizz";

    static String generate(int value) {
        if (value % 3 == 0) {
            return FIZZ;
        }
        return "";
    }
}
