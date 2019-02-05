package fr.lclv.katas.fizzBuzzByMoi;

class Buzz {
    private static final String BUZZ = "Buzz";

    static String generate(int value) {
        if(value % 5 == 0){
            return BUZZ;
        }
        return "";
    }
}
