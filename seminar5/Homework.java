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
    public static void main(String[] args) {
        HashMap<String, List<String>> phoneBook = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[3];
        while (scanner.hasNext()) {
            String inputString = scanner.nextLine();
            if (inputString.equalsIgnoreCase("EXIT")) {
                return;
            } else {
                input = inputString.split(" ");
            }
            String command = input[0];
            String name = input[1];
            String phone = input[2];
            switch (command.toUpperCase()) {
                case "ADD" -> {
                    addToPhonebook(phoneBook, name, phone);
                    System.out.println(phoneBook);
                }
            }
        }
    }

    private static void addToPhonebook(HashMap<String, List<String>> phoneBook, String name, String phone) {
        if (!phoneBook.containsKey(name)) {
            phoneBook.put(name, new ArrayList<>(Arrays.asList(phone)));
        } else {
            List<String> phones = phoneBook.get(name);
            phones.add(phone);
            phoneBook.put(name, phones);
        }
    }
}
