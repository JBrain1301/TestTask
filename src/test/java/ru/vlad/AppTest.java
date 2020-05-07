package ru.vlad;

import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class AppTest {
    @Test
    public void isNumberPalindrome() {
        assertTrue(App.isNumberPalindrome(242));
        assertTrue(App.isNumberPalindrome(141));
        assertTrue(App.isNumberPalindrome(656));
        assertFalse(App.isNumberPalindrome(143));
        assertFalse(App.isNumberPalindrome(58));
        assertFalse(App.isNumberPalindrome(456));
    }

    @Test
    public void shouldFindFibonacciNumberLessFiveSecond() {
        long before = System.currentTimeMillis();
        App.fibonacciNumber(100);
        long after = System.currentTimeMillis();
        assertTrue((after - before) < 5000);
    }
}

