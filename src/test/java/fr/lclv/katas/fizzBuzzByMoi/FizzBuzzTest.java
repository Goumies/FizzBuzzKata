package fr.lclv.katas.fizzBuzzByMoi;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class FizzBuzzTest {
    @Test
    public void counting_from_1_to_100_should_return_generated_string_with_fizz_for_multiple_of_3_buzz_for_multiple_of_5_and_fizzbuzz_for_multiple_of_15() {
        String generatedString = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
        assertThat(FizzBuzz.generate(1,100)).isEqualTo(generatedString);
    }

    @Test
    public void counting_from_90_to_100_should_return_generated_string_with_fizz_for_multiple_of_3_buzz_for_multiple_of_5_and_fizzbuzz_for_multiple_of_15() {
        String generatedString = "FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
        assertThat(FizzBuzz.generate(90,100)).isEqualTo(generatedString);
    }

    @Test
    public void counting_from_1_to_15_should_return_generated_string_with_fizz_for_multiple_of_3_buzz_for_multiple_of_5_and_fizzbuzz_for_multiple_of_15() {
        String generatedString = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz";
        assertThat(FizzBuzz.generate(1,15)).isEqualTo(generatedString);
    }

    @Test
    public void counting_from_1_to_5_should_return_generated_string_with_fizz_for_multiple_of_3_buzz_for_multiple_of_5() {
        String generatedString = "12Fizz4Buzz";
        assertThat(FizzBuzz.generate(1, 5)).isEqualTo(generatedString);
    }

    @Test
    public void with_3_passed_to_generate_from_Fizz_class_should_return_fizz() {
        String generatedString = "Fizz";
        assertThat(Fizz.generate(3)).isEqualTo(generatedString);
    }

    @Test
    public void with_1_passed_to_generate_from_Fizz_class_should_return_empty_string() {
        String generatedString = "";
        assertThat(Fizz.generate(1)).isEqualTo(generatedString);
    }

    @Test
    public void with_5_passed_to_generate_from_Buzz_class_should_return_buzz() {
        String generatedString = "Buzz";
        assertThat(Buzz.generate(5)).isEqualTo(generatedString);
    }

    @Test
    public void with_3_passed_to_generate_from_Fizz_class_should_return_empty_string() {
        String generatedString = "";
        assertThat(Buzz.generate(3)).isEqualTo(generatedString);
    }
}
