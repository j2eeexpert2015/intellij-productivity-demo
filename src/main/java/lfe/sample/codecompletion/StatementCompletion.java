package lfe.sample.codecompletion;

import java.util.List;

/**
 * To complete a statement in IntelliJ IDEA, use the keyboard shortcut Ctrl+Shift+Enter
 * <p>
 * Complete statement can add your semicolons, brackets and manage caret placement for you.
 * It also moves the caret to the next statement position.
 */
public class StatementCompletion {
    private boolean flag = true;
    private int i = 10;
    private String testStr = "";

    int j = 200;
    public void test() {

    }

    /**
     * Complete a method declaration
     * <p>
     * Start typing a method declaration and press Ctrl+Shift+Enter after the opening parenthesis.
     */
    public void testStatementCompletion(boolean test) {
        //System.out.println(flag);
    }

    /**
     * Complete a code construct
     *
     * Start typing a code construct and press Ctrl+Shift+Enter.
     * IntelliJ IDEA automatically completes the construct and adds the required punctuation.
     * The caret is placed at the next editing position.
     */

    public void testBlockCompletion(boolean test) {
        int i = 100;

    }

    /**
     *  Wrap a method call argument
     *
     *  Type an expression. Then type a method call.
     *  When println gets the focus in the suggestion list, select it with Ctrl+Shift+Enter:
     */

    public void testWrapCallArgument() {
       int i =100;
        System.out.println(i);
        boolean test = false ;
        testBlockCompletion(test);
    }

}
