package com.example.demo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    FizzBuzz sut = new FizzBuzz();

    @Test
    void fizz_when_multiple_of_3(){
        assertThat(sut.execute(3).equals("fizz")).isTrue();
    }
    @Test
    void HIKIDA_when_multiple_of_50(){
        assertThat(sut.execute(50).equals("HIKIDA")).isTrue();
    }


    @ParameterizedTest
    @CsvSource({
            "3, fizz", // 正常値
            "6, fizz", // 正常値
            "5, buzz", // null
           "10, buzz", // null
            "15, fizzbuzz", // 64文字
            "30, fizzbuzz", // 64文字
            "22, 22",
            "16, 16" // // 65文字
    })
    void fizzbuzz(int num, String expected) {
        assertThat(sut.execute(num).equals(expected)).isTrue();

    }




}