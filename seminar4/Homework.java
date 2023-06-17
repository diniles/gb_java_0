/*
Урок 4. Хранение и обработка данных ч1: приоритетные коллекции

Реализовать консольное приложение, которое:
1. Принимает от пользователя и “запоминает” строки.
2. Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
3. Если введено revert, удаляет предыдущую введенную строку из памяти.
4. Если введено exit, то программа завершается

> - ввод в консоль (stdin), < - вывод на консоль (stdout)
> java
> python
> c#
> print
< [c#, python, java]
> revert
> print
< [python, java]
> revert
> revert
> print
< []
> revert -> throw new NoSuchElementException
*/

package seminar4;

import java.util.*;

public class Homework {


    public static void main(String[] args) throws NoSuchElementException {
        Scanner scanner = new Scanner(System.in);
        Deque<String> strings = new LinkedList<>();
        String input;
        while (scanner.hasNext()) {
            input = scanner.nextLine();
            switch (input) {
                case "print" -> printList(strings);
                case "revert" -> strings.removeLast();
                case "exit" -> {
                    return;
                }
                default -> strings.add(input);
            }
        }
    }

    public static void printList(Deque<String> list) {
        if (list.size() == 0) {
            System.out.println("[]");
        } else {
            System.out.print("[");
            for (Iterator itr = list.descendingIterator();
                 itr.hasNext(); ) {
                System.out.print(itr.next() + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}
