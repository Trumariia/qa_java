package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class LionTest {

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false",
            "Другое, null"
    })
    @DisplayName("Проверка конструктора создания льва")
    void doesHaveMane(String sex, Boolean hasMane) {
        Lion lion = null;
        try {
            lion = new Lion(sex);
            assertEquals(hasMane, lion.doesHaveMane());
        } catch (Exception e) {
            assertTrue(e.getMessage().contains("самец или самка"));
        }
    }
}