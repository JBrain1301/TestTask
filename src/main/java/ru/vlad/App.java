package ru.vlad;

public class App {
    public static void main(String[] args) {

    }
    public static boolean isNumberPalindrome(int number) {
        String stringNumber = String.valueOf(number);
        char[] chars = stringNumber.toCharArray();
        String number1 = "", number2 = "";
        for (int i = 0; i < chars.length / 2; i++) {
            number1 += chars[i];
            number2 += chars[chars.length - 1 - i];
        }
        return number1.equalsIgnoreCase(number2);
    }

    public static long fibonacciNumber(int number){
        long firstNumber = 1;
        long secondNumber = 1;
        long result = 0;
        for(int i = 3; i <= number; i++){
            result=firstNumber+secondNumber;
            firstNumber=secondNumber;
            secondNumber=result;
        }
        return result;
    }
}

