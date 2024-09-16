package lfe.sample.codecompletion;

import ch.qos.logback.core.util.ExecutorServiceUtil;
import lfe.sample.model.Person;

import java.util.*;
import java.util.concurrent.ExecutorService;

import lfe.sample.util.DataUtil;


/**
 * Ctrl+Shift+Space (Windows/Linux) to invoke smart completion.
 * If the type can be determined then the list of suggestions will be filtered to the correct type.
 *
 * Here are some places you can use it:
 * 1.In the right part of assignment statements
 * 2.In variable initializers
 * 3.In return statements
 * 4.In the list of arguments of a method call
 * 5.After the new keyword in an object declaration
 * 6.In chained expressions
 */
public class SmartCodeCompletion {
    // 1. Type-matching completion in the right part of assignment statements
    public void assignmentCompletion() {
        // IntelliJ will suggest compatible types like ArrayList or LinkedList based on List<String> type
        List<String> list;
        list =new ArrayList<>();
        // Suggested completion: new ArrayList<>(); or new LinkedList<>();
    }

    // 2. Type-matching completion in variable initializers
    public void variableInitializerCompletion() {
        // IntelliJ will suggest constructors or factory methods like Arrays.asList()
        // that match the List<String> type in this variable initializer
        String[] sampleStringArray = {"One","Two","Three"};
        List<String> list = Arrays.asList(sampleStringArray);
        // Suggested completion: Arrays.asList("One", "Two"); or new ArrayList<>();
    }

    // 3. Type-matching completion in return statements
    public List<String> returnCompletion() {
        // IntelliJ will suggest compatible return values based on the method's return type
        String[] sampleStringArray = {"One","Two","Three"};
        //return Collections.emptyList();
        return Arrays.asList(sampleStringArray);
        // Suggested completion: new ArrayList<>(); or Arrays.asList("a", "b");
    }



    // 4. Type-matching completion in the list of arguments of a method call
    // 5. Type-matching completion after the 'new' keyword in object creation
    public void newKeywordCompletion() {
        // IntelliJ will suggest compatible implementations of List<String>
        // after the new keyword
        Calendar calendar ;
        calendar = new GregorianCalendar(Locale.CANADA);

    }

    public static void main(String[] args) {
        // 6. Type-matching completion in chained method calls - for static expressions,lists ,arrays
        ExecutorService executorService = ExecutorServiceUtil.newExecutorService();

        String[] names = {"Steve","Peter"};
        //List<String> list = Arrays.asList(names);
        //String[] p =
        Person p = DataUtil.getPersonMap().get(1);



    }
}
