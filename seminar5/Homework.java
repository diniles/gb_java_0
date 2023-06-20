/*
Урок 5. Хранение и обработка данных ч2: множество коллекций Map
Формат сдачи: ссылка на подписанный git-проект.

Задание

Реализовать консольное приложение - телефонный справочник.
У одной фамилии может быть несколько номеров.
Пользователь может вводить команды:
1. ADD Ivanov 88005553535 - добавить в справочник новое значение. Первый аргумент - фамилия, второй - номер телефона
2. GET Ivanov - получить список всех номеров по фамилии
3. REMOVE Ivanov - удалить все номера по фамилии
4. LIST - Посмотреть все записи
5. EXIT - Завершить программу
6. Команда не найдена
Если при GET или REMOVE нужной фамилии нет, вывести информацию об этом


Пример взаимодействия (=> - это вывод на консоль):
ADD Ivanov 8 800 555 35 35
ADD Ivanov 8 800 100 10 10
GET Ivanov => [8 800 555 35 35, 8 800 100 10 10]
ADD Petrov 8 555 12 34
LIST => Ivanov = [8 800 5553535, 8 800 100 10 10], Petrov = [8 555 12 34]
REMOVE Ivanov
LIST => Petrov = [8 555 12 34]
GET NoName => Не найдена запись с фамилией "NoName"
REMOVE NoName => Не найдена запись с фамилией "NoName"
*/
package seminar5;

import java.util.*;

public class Homework {
    static String command = "";
    static String name = "";
    static String phone = "";
    static String[] input = new String[3];

    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputString = scanner.nextLine();

            if (inputString.equalsIgnoreCase("EXIT")) {
                return;
            } else {
                parseInput(inputString);
            }
            switch (command) {
                case "ADD" -> addToPhonebook(phoneBook, name, phone);
                case "GET" -> getFromPhonebook(phoneBook, name);
                case "LIST" -> System.out.println(phoneBook);
                case "REMOVE" -> removeFromPhonebook(phoneBook, name);
                default -> {
                    System.out.println("Unknown command name");
                    System.out.println("Please enter in this format: \"COMMAND NAME PHONE\"");
                    System.out.println("Or: \"COMMAND NAME\"");
                    System.out.println("Or: \"EXIT\" to exit");
                }
            }
        }
    }

    private static void parseInput(String inputString) {
        input = inputString.split(" ", 3);
        switch (input.length) {
            case 1 -> command = input[0].toUpperCase();
            case 2 -> {
                command = input[0].toUpperCase();
                name = input[1].toUpperCase();
            }
            case 3 -> {
                command = input[0].toUpperCase();
                name = input[1].toUpperCase();
                phone = input[2];
            }
            default -> System.out.println("Please enter in this format: COMMAND NAME PHONE");
        }
    }

    private static void addToPhonebook(HashMap<String, List<String>> phoneBook, String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>(Collections.singletonList(phone)));
        } else {
            List<String> phones = phoneBook.get(name);
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }

    private static void getFromPhonebook(HashMap<String, List<String>> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            System.out.printf("%s phone number(s)\n", name);
            for (String el : phoneBook.get(name)) {
                System.out.println(el);
            }
        } else {
            System.out.println("Can't find records for this name " + name);
        }
    }

    private static void removeFromPhonebook(HashMap<String, List<String>> phoneBook, String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
        } else {
            System.out.println("Can't find records for this name " + name);
        }
    }

}
