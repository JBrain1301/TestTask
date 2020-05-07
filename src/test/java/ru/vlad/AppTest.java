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
        assertTrue(App.isNumberPalindrome(2442));
        assertTrue(App.isNumberPalindrome(5555));
        assertTrue(App.isNumberPalindrome(246642));
        assertTrue(App.isNumberPalindrome(656));
        assertFalse(App.isNumberPalindrome(143));
        assertFalse(App.isNumberPalindrome(547));
        assertFalse(App.isNumberPalindrome(123456));
        assertFalse(App.isNumberPalindrome(2258));
        assertFalse(App.isNumberPalindrome(985));
        assertFalse(App.isNumberPalindrome(58));
        assertFalse(App.isNumberPalindrome(456));
    }

    @Test
    public void shouldFindFibonacciNumberLessFiveSecond() {
        long before = System.currentTimeMillis();
        long fibonacci = App.fibonacciNumber(4);
        long after = System.currentTimeMillis();
        assertTrue((after - before) < 5000);
    }
}

