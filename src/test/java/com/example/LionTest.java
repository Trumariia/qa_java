package com.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class LionTest {

    @Mock
    Feline felineMock;

    @ParameterizedTest
    @CsvSource({
            "Самец, true",
            "Самка, false"
    })
    @DisplayName("Проверка конструктора создания льва")
    void doesHaveMane(String sex, Boolean hasMane) throws Exception {
        Lion lion = new Lion(sex, felineMock);
        assertEquals(hasMane, lion.doesHaveMane());
    }

    @DisplayName("Проверка исключения")
    @Test
    public void lionConstructorThrowsIfSexIsInvalid() {
        assertThrows(Exception.class, () -> new Lion("Неизвестно", felineMock));
    }

    @Test
    @DisplayName("Проверка метода getFood() возвращает результат из Predator.eatMeat()")
    public void testGetFoodReturnsEatMeatResult() throws Exception {
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        when(felineMock.eatMeat()).thenReturn(expectedFood); // стаб

        Lion lion = new Lion("Самец", felineMock);
        List<String> result = lion.getFood();

        assertEquals(expectedFood, result);
    }
}