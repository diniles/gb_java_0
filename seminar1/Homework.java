package seminar1;

import java.util.Arrays;

public class Homework {

    public static void main(String[] args) {
//        System.out.println(isSumBetween10And20(5, 10)); // true
//        System.out.println(isSumBetween10And20(5, 15)); // true
//        System.out.println(isSumBetween10And20(7, 15)); // false
//        System.out.println(isSumBetween10And20(2, 6)); // false

//        System.out.println(isPositive(5)); // true
//        System.out.println(isPositive(0)); // false
//        System.out.println(isPositive(-3)); // false
//
//        printString("abcd", 5); // abcdabcdabcdabcdabcd
//
//        System.out.println(isLeapYear(0));
//        System.out.println(isLeapYear(4));
//        System.out.println(isLeapYear(100));
//        System.out.println(isLeapYear(400));
//        System.out.println(isLeapYear(2024));
//
//        int[] arr = createArray(5, 10);
//        System.out.println(Arrays.toString(arr)); // [10, 10, 10, 10, 10]
//
//        int[] array = {0, 1, 0, 1, 0, 1, 0, 1, 0};
//        changeOneToZero(array);
//
//        timesTwo(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});
//

        int[][] matrix = new int[4][4]; // [[1, 0, 0, 0], [0, 1, 0, 0], [0, 0, 1, x], [0, 0, 0, 1]]
        printMatrixInt(matrix);
        System.out.println();
        fillMatrixDiagonals(matrix);
        printMatrixInt(matrix);
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
     */
    private static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20
        return a + b >= 10 && a + b <= 20;
    }

    private static boolean isPositive(int x) {
        // проверить, что х положительное
        return x > 0;
    }

    private static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        for (int i = 0; i < repeat; i++) {
            System.out.print(source);
        }
    }

    private static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        // год является високосным, если он делится на 4, но не делится на 100, но делится на 400
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static int[] createArray(int len, int initialValue) {
        // должен вернуть массив длины len, каждое значение которого равно initialValue
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i] = initialValue;
        }
        return array;
    }


    /**
     * 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
     * Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
     */
    private static void changeOneToZero(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
            System.out.printf("%d ", array[i]);
        }
    }

    /**
     * 2. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
     */
    private static void timesTwo(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }
            System.out.printf("%d ", array[i]);
        }

        /**
         *
         * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
         * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
         * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
         * * Также заполнить элементы побочной диагонали
         *
         * 4. Подготовить вопросы к следующему уроку.
         */
    }

    /**
     * 3. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
     * и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе
     * сложно).
     * Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть
     * [0][0], [1][1], [2][2], …, [n][n];
     * <p>
     * Также заполнить элементы побочной диагонали
     */

    private static void fillMatrixDiagonals(int[][] array) {
        int length = array.length;
        for (int i = 0, j = 0; i < length; i++, j++) {
            array[i][j] = 1;
        }
        for (int i = length - 1; i >= 0; i--) {
            array[i][length - 1 - i] = 1;
        }

    }

    private static void printMatrixInt(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%d ", array[i][j]);
            }
            System.out.println();
        }
    }
}