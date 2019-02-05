package fr.lclv.katas.fizzBuzzByMoi;

import java.util.stream.IntStream;

class FizzBuzz {
    static String generate(int startInclusive, int stopInclusive) {
        StringBuilder generatedOutput = new StringBuilder();
        IntStream.rangeClosed(startInclusive, stopInclusive)
            .forEach(element -> {
                if(element % 3 == 0 && element % 5 == 0) {
                    generatedOutput.append(Fizz.generate(element)).append(Buzz.generate(element));
                    return;
                }
                if(element % 3 == 0) {
                    generatedOutput.append(Fizz.generate(element));
                    return;
                }
                if(element % 5 == 0) {
                    generatedOutput.append(Buzz.generate(element));
                    return;
                }
                generatedOutput.append(element);
            });
        return String.valueOf(generatedOutput);
    }
}
