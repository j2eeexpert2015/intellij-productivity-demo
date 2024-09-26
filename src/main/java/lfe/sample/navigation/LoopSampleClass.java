package lfe.sample.navigation;

public class LoopSampleClass {

    // Method to print numbers from 1 to 10
    public void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }

    // Method to print only even numbers up to 20
    public void printEvenNumbers() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    // Method to print elements of an array
    public void printArrayElements(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    // Method to countdown from 10 to 1
    public void countDown() {
        for (int i = 10; i > 0; i--) {
            System.out.println("Countdown: " + i);
        }
    }

    // Method with nested for loops to print a multiplication table
    public void printMultiplicationTable(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}

