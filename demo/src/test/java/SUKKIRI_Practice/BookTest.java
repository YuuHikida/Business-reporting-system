package SUKKIRI_Practice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book sut = new Book("こんにちは", LocalDate.of(2022,2,2),"こめんと");
//    Book sut2 = new Book("こんにちは", LocalDate.of(2022,2,2),"こめんと");


    @ParameterizedTest
    @CsvSource({

            "こんにちは,2022-02-02,こめんと,true",
            "こんばんは,2022-02-02,こめんと,false",
            "こんにちは,2022-02-22,こめんと,false"
    })

//    void testDateParsing(String dateString) {
//        LocalDate date = LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);

    void equals(String title, String dateString, String comment,boolean expected) {

        LocalDate date=LocalDate.parse(dateString, DateTimeFormatter.ISO_LOCAL_DATE);
        Book otherBook = new Book(title,date,comment);

        assertEquals(expected,sut.equals(otherBook));
    }


    @Test
    void copy()
    {
        //準備
        Book sut =new Book("こんにちは",LocalDate.of(2022,2,2),"こめんと");
        //実行
        Book cloneBook=sut.clone();
        //確認
        assertTrue(sut.equals(cloneBook)&&sut!=cloneBook);
    }

}