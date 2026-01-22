package com.example;

import java.util.List;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return List.of("Трава", "Различные растения");
        } else if ("Хищник".equals(animalKind)) {
            return List.of("Животные", "Птицы", "Рыба");
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    } //Метод getFood(String animalKind) принимает строку, которая указывает вид животного
    // ("Травоядное" или "Хищник"), и возвращает список предпочитаемой пищи в зависимости от вида.
    // Если передать строку, отличную от "Травоядное" или "Хищник",
    // метод выбросит исключение Exception с сообщением об ошибке.
    // Метод возвращает список строк (List<String>).


    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    } //метод getFamily не принимает аргументов и возвращает строку с перечнем семейств животных.
}