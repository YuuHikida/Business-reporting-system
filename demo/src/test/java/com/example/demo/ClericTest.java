package com.example.demo;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class ClericTest {
    //Cleric sut = new Cleric("yuu",10,10);

//    @Test
//    void mpClacTest() {
//
//        assertThat(sut.pray(5), allOf(greaterThanOrEqualTo(5), lessThanOrEqualTo(7)));
//        //assertThat(sut.pray(5), is(allOf(greaterThanOrEqualTo(5), lessThanOrEqualTo(7))));
//        //assertThat(result, allOf(greaterThanOrEqualTo(5), lessThanOrEqualTo(7)));
//    }
//
//    @Test
//    void mpCalcTestAnother() {
//
//        assertThat(sut.pray(3), allOf(greaterThanOrEqualTo(3), lessThanOrEqualTo(5)));
//    }
//
//    @Test
//    void mpClacTest_Insert_Zero() {
//        assertThat(sut.pray(0), allOf(greaterThanOrEqualTo(0), lessThanOrEqualTo(2)));
//    }

    @ParameterizedTest
    @CsvSource({
            "3, 3,5,1",
            "6,6,8,1",
            "10,0,10,1",
            "10000000,0,10,1",
            "0,0,2,5"
    })
    void mpCalcAll(int praySecond, int expected, int expected2 ,int initialMp) {
        Cleric sut =new Cleric("yuu",10,initialMp);
        //c.setMp(initialMp);
        assertThat(sut.pray(praySecond), allOf(greaterThanOrEqualTo(expected), lessThanOrEqualTo(expected2)));
    }
//    void fizzbuzz(int num, String expected) {
//        Assertions.assertThat(sut.execute(num).equals(expected)).isTrue();
//
//    }


}