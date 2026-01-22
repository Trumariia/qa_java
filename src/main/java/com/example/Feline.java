package com.example;

import java.util.List;

public class Feline extends Animal implements Predator {
    // класс Кошачьи - наследник Animal реализует интерфейс Хищник

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

}
// public class Feline extends Animal implements Predator — объявление класса Feline,
// который является наследником класса Animal и реализует методы интерфейса Predator.
// Это означает, что класс Feline должен предоставить реализации всех методов, объявленных
// в интерфейсе Predator.
//@Override public List<String> eatMeat() throws Exception — метод eatMeat, который
// переопределяет соответствующий метод из интерфейса Predator.
// Этот метод вызывает метод getFood из класса Animal, передавая ему строку "Хищник", и
// возвращает полученный список.
//@Override public String getFamily() — метод getFamily, который переопределяет метод из класса Animal.
// В данном случае он всегда возвращает строку "Кошачьи".
//public int getKittens() и public int getKittens(int kittensCount) — два метода getKittens,
// один из которых без параметров вызывает другой метод getKittens с параметром по умолчанию 1.
// Второй метод просто возвращает переданное количество котят kittensCount.
//Этот код демонстрирует пример наследования и реализации интерфейса в Java, а также использование
// метода переопределения (@Override).