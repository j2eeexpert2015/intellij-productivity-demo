package lfe.sample.codeanalysis;

import java.io.File;
import java.io.FileReader;

public class InspectionExamples {

    // Unused Imports Example
    public void unusedImportsExample() {
        // This method demonstrates an unused import issue.
        System.out.println("Hello, World!"); // No issues here
    }

    // Redundant Code Example
    public void redundantCodeExample() {
        // Redundant condition
        System.out.println("This condition is always true.");
    }

    // Null Pointer Risk Example
    public void nullPointerRiskExample() {
        String name = null;
        // Potential NullPointerException
        System.out.println(name.toUpperCase());
    }

    // Code Optimization Example
    public void codeOptimizationExample() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int i = 0; i < numbers.length; i++) { // Can use enhanced for loop
            System.out.println(numbers[i]);
        }
    }

    // Variable Naming Issue Example
    public void variableNamingExample() {
        int i = 42; // Non-descriptive variable name
        System.out.println(i);
    }

    // Unnecessary Boxing Example
    public void unnecessaryBoxingExample() {
        Integer number = Integer.valueOf(10); // Unnecessary boxing
        System.out.println(number);
    }

    // Method Can Be Static Example
    public void methodCanBeStaticExample() {
        System.out.println("This method can be static.");
    }

    // Exception Not Properly Handled Example
    public void exceptionHandlingExample() {
        File file = new File("nonexistent.txt");
        try {
            FileReader reader = new FileReader(file); // Potential exception
        } catch (Exception e) {
            e.printStackTrace(); // Properly handled exception
        }
    }

    // Main Method to Run All Examples
    public static void main(String[] args) {
        InspectionExamples examples = new InspectionExamples();

        // Uncomment each method call to test individually
        examples.unusedImportsExample();
        examples.redundantCodeExample();
        examples.nullPointerRiskExample();
        examples.codeOptimizationExample();
        examples.variableNamingExample();
        examples.unnecessaryBoxingExample();
        examples.methodCanBeStaticExample();
        examples.exceptionHandlingExample();
    }
}
