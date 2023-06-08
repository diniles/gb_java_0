/*
Урок 2. Почему вы не можете не использовать API
*/

package seminar2;

public class Homework {
    /**
     * 1. Реализовать метод isPalindrome
     * 2. Пересмотреть мой спич про работу с файловой системой. Подготовить вопросы.
     */

    /**
     * Проверить, является ли строка палиндромом.
     * Палиндром - это строка, которая читается одинаково слева и справа
     * abcdedcba -> true
     * a -> true
     * abc -> false
     * abcd -> false
     * abba -> true
     */
    static boolean isPalindrome(String source) {
        // TODO: 08.06.2023
        StringBuilder reversedString = new StringBuilder();
        for (int i = source.length() - 1; i >= 0; i--) {
            reversedString.append(source.charAt(i));
        }
        return source.contentEquals(reversedString);
    }
}