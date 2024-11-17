package lfe.sample.codeanalysis;

import java.util.ArrayList;
import java.util.List;

public class IntentionExamples {

    // Example 1: Simplify Boolean Expression
    public void simplifyBooleanExpression() {
        boolean isValid = (5 > 3) ? true : false; // Simplifiable
        System.out.println(isValid);
    }

    // Example 2: Convert For Loop to Stream API
    public void convertLoopToStream() {
        List<String> names = List.of("Alice", "Bob", "Charlie");
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Example 3: Replace String Concatenation with String.format
    public void replaceStringConcatenation() {
        String name = "Alice";
        int age = 25;
        String message = "Name: " + name + ", Age: " + age; // Can use String.format
        System.out.println(message);
    }

    // Example 4: Replace Anonymous Class with Lambda
    public void replaceAnonymousClassWithLambda() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running...");
            }
        };
        runnable.run();
    }

    // Example 5: Create Constant Field
    public void createConstantField() {
        System.out.println("Value: " + 3.14); // Suggest to extract 3.14 as a constant
    }

    // Example 6: Merge Nested If Statements
    public void mergeNestedIfStatements(boolean condition1, boolean condition2) {
        if (condition1) {
            if (condition2) {
                System.out.println("Both conditions are true.");
            }
        }
    }

    // Example 7: Add Parameter to Method
    public void addParameterExample() {
        printMessage(); // IntelliJ can suggest adding a parameter to this method
    }

    private void printMessage() {
        System.out.println("This is a message.");
    }

    // Example 8: Iterate Through Collection
    public void iterateThroughCollection() {
        List<String> items = new ArrayList<>();
        // IntelliJ can suggest generating a loop to iterate through this collection

    }

    // Example 9: Invert If Condition
    public void invertIfCondition(int number) {
        if (number > 0) {
            System.out.println("Positive number.");
        } else {
            System.out.println("Non-positive number.");
        }
    }

    // Example 10: Generate Getter and Setter
    private String field;

    public void generateGetterAndSetter() {
        // IntelliJ can generate getter and setter for 'field'
    }

    public static void main(String[] args) {
        IntentionExamples examples = new IntentionExamples();
        examples.simplifyBooleanExpression();
        examples.convertLoopToStream();
        examples.replaceStringConcatenation();
        examples.replaceAnonymousClassWithLambda();
        examples.createConstantField();
        examples.mergeNestedIfStatements(true, false);
        examples.addParameterExample();
        examples.iterateThroughCollection();
        examples.invertIfCondition(-1);
    }
}

