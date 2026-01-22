package com.example;

import java.util.List;

public class Cat {

    Predator predator; // объявили класс Cat с полем predator, которое имеет тип Predator

    public Cat(Feline feline) {
        this.predator = feline;
    } //Этот код представляет собой конструктор класса Cat,
    // который принимает один параметр типа Feline и присваивает его полю predator.
    // Конструктор — это специальный метод, который вызывается при создании нового
    // объекта класса. В данном случае при создании объекта Cat необходимо передать
    // объект типа Feline, который будет сохранён в поле predator созданного экземпляра Cat.

    public String getSound() {
        return "Мяу";
    }
    //метод getSound возвращает строку Мяу

    public List<String> getFood() throws Exception {
        return predator.eatMeat();
    } // метод getFood вызывает метод eatMeat у объекта predator и возвращает результат

}
