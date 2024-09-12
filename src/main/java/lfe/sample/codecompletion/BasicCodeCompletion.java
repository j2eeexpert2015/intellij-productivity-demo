package lfe.sample.codecompletion;

import lfe.sample.model.Student;

/**
 * Start typing a name. By default, IntelliJ IDEA displays the code completion popup
 * automatically as you type.
 * If automatic completion is disabled, press Ctrl + Space
 * or choose Code -> Code Completion -> Basic from the main menu.
 */
public class BasicCodeCompletion {
    public String sampleText = "Sample Dummy Text ";
    public void printSampleText() {
        sampleText = sampleText.toLowerCase();
        Student student = new Student("Peter",30,"Dummy Address");
        //student.
    }

}
