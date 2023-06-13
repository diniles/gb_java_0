/*
Урок 3. Коллекции JAVA: Введение
*/

package seminar3;

import java.util.ArrayList;
import java.util.Collections;

public class Homework {
    /*
    Пусть дан произвольный список целых чисел.
    1) Нужно удалить из него чётные числа (void removeEven(ArrayList<Integer> list))
    2) Найти минимальное значение (Integer findMin(ArrayList<Integer> list))
    3) Найти максимальное значение
    4) Найти среднее значение
    То есть, нужно реализовать 4 метода, каждый из которых принимает список целых чисел, и делает свою работу.
    */
    static void removeEven(ArrayList<Integer> list) {
        list.removeIf(i -> (i % 2 == 0));
    }

    static Integer findMin(ArrayList<Integer> list) {
        return Collections.min(list);
    }

    static Integer findMax(ArrayList<Integer> list) {
        return 0;
    }

    static Integer findAverage(ArrayList<Integer> list) {
        return 0;
    }

}
