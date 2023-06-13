package seminar3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


public class HomeworkTest {

    @Test
    public void removeEvenTest() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(i);
        }

        Homework.removeEven(listOfNumbers);

        int[] correctList = new int[]{1, 3, 5, 7, 9};
        int[] listOfOddNumbers = new int[listOfNumbers.size()];
        for (int i = 0; i < listOfOddNumbers.length; i++) {
            listOfOddNumbers[i] = listOfNumbers.get(i);
        }

        Assertions.assertArrayEquals(correctList, listOfOddNumbers);
    }

    @Test
    public void findMinTest() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(i);
        }
        Assertions.assertEquals(0, Homework.findMin(listOfNumbers));
    }

    @Test
    public void findMaxTest() {
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            listOfNumbers.add(i);
        }
        Assertions.assertEquals(9, Homework.findMax(listOfNumbers));
    }
}
