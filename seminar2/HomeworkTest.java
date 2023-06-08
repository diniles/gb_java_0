package seminar2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class HomeworkTest {
    @Test
    public void tests() {
        assertTrue(Homework.isPalindrome("abcdedcba"));
        assertTrue(Homework.isPalindrome("a"));
        assertFalse(Homework.isPalindrome("abc"));
        assertFalse(Homework.isPalindrome("abcd"));
        assertTrue(Homework.isPalindrome("abba"));
    }
}