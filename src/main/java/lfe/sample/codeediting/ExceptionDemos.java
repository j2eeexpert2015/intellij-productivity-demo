package lfe.sample.codeediting;

import java.io.FileNotFoundException;

public class ExceptionDemos {

    // 1. ArithmeticException (Division by Zero)
    public static int divide(int a, int b) {
        return a / b;

    }

    // 2. NullPointerException
    public static void printLength(String str) {
        System.out.println(str.length());

    }

    // 3. ArrayIndexOutOfBoundsException
    public static int getElement(int[] arr, int index) {
        return arr[index];

    }

    // 4. NumberFormatException
    public static int parseInteger(String str) {
        return Integer.parseInt(str); // .try will add a try-catch block
    }

    // 5. FileNotFoundException
    public static void readFile(String fileName) throws FileNotFoundException {
        new java.io.FileReader(fileName); // .throw will add the throws clause
    }

    public static void main(String[] args) {
        // You would typically call these methods here and handle exceptions gracefully.
    }
}
