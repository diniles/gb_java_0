/*
Урок 6. Хранение и обработка данных ч3: множество коллекций Set
Доработать проект, который начали на уроке.

Добавить в кота следующее. Пусть голод кота оценивается не true\false, а по шкале (1, 2, ..., 10).
Кот хочет съесть то количество еды, каков его текущий голод. Например, если аппетит кота = 100, а голод 5, то он съест 50.
Кот съедает все, что есть в тарелке. Например, в тарелке 50, коту нужно 70, он съест 50.

Пример.
Кот, его аппетит = 100
Пусть кот сыт наполовину, то есть его голод = 5. То есть, ему нужно 50 единиц еды.
Пусть в тарелке 25 единиц еды.
После обеда, сытость кота будет равна 7, а еда в тарелке закончится.
*/
package seminar6;

import java.util.HashSet;

public class Homework {
    public static void main(String[] args) {
        Plate plate = new Plate(250);
        Cat murzik = new Cat("Murzik", 100, 5);
        Cat gav = new Cat("Gav", 50, 3);

        System.out.printf("Now on the plate %s pieces of food.\n", plate);
        System.out.printf("Cat %s.\n", murzik);
        System.out.printf("Cat %s.\n", gav);

        murzik.eat(plate);
        gav.eat(plate);

        System.out.printf("Now on the plate %s pieces of food.\n", plate);
        System.out.printf("Cat %s.\n", murzik);
        System.out.printf("Cat %s.\n", gav);
        System.out.printf("Now on the plate %s pieces of food.\n", plate);

        HashSet<Cat> cats = new HashSet<>();
        cats.add(murzik);
        cats.add(gav);
        System.out.println("Our cats");
        System.out.println(cats);
    }
}
