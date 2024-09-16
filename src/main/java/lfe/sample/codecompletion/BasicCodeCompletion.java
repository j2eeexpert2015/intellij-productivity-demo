package lfe.sample.codecompletion;

import lfe.sample.model.Student;

/**
 * Start typing a name. By default, IntelliJ IDEA displays the code completion popup
 * automatically as you type.
 * If automatic completion is disabled, press Ctrl + Space
 * or choose Code -> Code Completion -> Basic from the main menu.
 */
public class BasicCodeCompletion {

    public String name ="Dummy Name !";
    public void codeCompletionDemo()
    {
        name=name.toUpperCase();
        Student student = new Student("dummy name",50,"US");
        
    }

}
