package lfe.sample.codeformatting;

import java.util.*;

public class SampleForFormatting {

    public static void main(String[] args) {
        int sum = add(5, 10);
        //Sample Comment 1
        int i = 10;
        System.out.println("Sum: " + sum);
    }

    public static int add(int a, int b) {
        return a + b;
    }


    public void wronglyFormattedMethod() {
        //Sample Comment 2
        int j = 100;
        System.out.println("First line");
        System.out.println("Second line");
        System.out.println("Third line");
        for (int i = 0; i < 3; i++) {
            System.out.println("I have no idea where the indentation is supposed to be");
        }
    }


    private Map<Integer, List<String>> integerStringMap;

    public void errorLengthCalculator() {
        // Initialize the map with dummy values
        integerStringMap = new HashMap<>();
        integerStringMap.put(1, Arrays.asList("error123", "info", "error456"));
        integerStringMap.put(2, Arrays.asList("warning", "error789"));
        integerStringMap.put(3, Arrays.asList("debug", "error101112", "trace"));
    }

    private int replaceWithMapToInt() {

        int sum = integerStringMap.values()
                                  .stream()
                                  .filter(Objects::nonNull)
                                  .flatMap(Collection::stream)
                                  .filter(stringVal -> stringVal.contains("error"))
                                  .mapToInt(String::length)
                                  .sum();


        //int sum = integerStringMap.values().stream().filter(Objects::nonNull).flatMap(Collection::stream).filter(stringVal -> stringVal.contains("error")).mapToInt(String::length).sum();
        return sum;
    }


    public void anotherWronglyFormattedMethod() {
        System.out.println("First line");
            System.out.println("Second line");
        System.out.println("Third line");
        for (int i = 0; i < 3; i++) {
            System.out.println("In-correct indentation");
        }
    }

}

