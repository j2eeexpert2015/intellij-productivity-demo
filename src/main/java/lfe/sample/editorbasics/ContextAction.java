package lfe.sample.editorbasics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static java.util.Collections.sort;

public class ContextAction {

    public void importExample() {
        List<String> list = new ArrayList<>();
        List<String> anotherList = new ArrayList<>();

    }
    public void errorExample() {
        HashMap<Integer, String> strings = new HashMap<Integer,String>();
    }
    private static void methodWithUnusedParameter(String used) {
        System.err.println("It is used parameter: " + used);
    }

    public void lambdaExample(boolean z, boolean a, boolean b) {
        // Convert the array to a list
        List<String> strList = Arrays.asList("Hello", "IntelliJ IDEA", "Learning");

        // Use Collections.sort with a case-insensitive comparator
        sort(strList, String::compareToIgnoreCase);
    }
}
