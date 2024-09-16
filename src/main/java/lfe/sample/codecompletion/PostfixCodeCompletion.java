package lfe.sample.codecompletion;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

/**
 * Whenever you have an existing expression, you can append a specific postfix after a dot
 * and apply it using a Tab key.
 * IntelliJ IDEA takes the expression and transforms it based on the postfix provided.
 */
public class PostfixCodeCompletion {
    public String name = "Java";
    List<String> days = Arrays.asList("Sun","Mon","Tues");
    public enum Day {MON,TUE,WED,THU,FRI,SAT,SUN , }
    /**
     * Displaying available templates: Ctrl + J
     * It will open a popup, which only shows items relevant to the given context,
     * not all the existing templates.
     * That means - if you open it when the cursor is next to a collection type,
     * it will only show postfixes applicable to a collection.
     */
    public void demonstratePostFixCodeCompletion() {
        //Null
        //Not Null Check
        //Try
        //For Iterate
        //Print with sout
        //Surround with try catch






        /**
         * Displaying available templates
         * You can use a handy shortcut to show the available postfixes: Ctrl + J
         * It will open a popup, which only shows items relevant to the given context,
         * not all the existing templates.
         * That means - if you open it when the cursor is next to a collection type,
         * it will only show postfixes applicable to a collection.
         */

    }


    //Create Custom Postfix
}
