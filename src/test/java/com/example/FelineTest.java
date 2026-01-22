package com.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FelineTest {
    private Feline feline = new Feline();

    @Test
    @DisplayName("Проверка метода eatMeat() возвращает список хищной пищи")
    public void testEatMeatReturnsPredatorFood() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test
    @DisplayName("Проверка метода getFamily() возвращает 'Кошачьи'")
    public void testGetFamilyReturnsCat() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }

    @Test
    @DisplayName("Проверка метода getKittens() возвращает 1")
    public void testGetKittensReturn1() {
        int kittens = feline.getKittens();
        assertEquals(1, kittens);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 5, 10})
    @DisplayName("Проверка метода getKittens(int) возвращает переданное количество котят")
    public void testGetKittensWithParameterReturnsCorrectCount(int kittensCount) {
        int result = feline.getKittens(kittensCount);
        assertEquals(kittensCount, result);
    }
}