package lfe.sample.codecompletion;


import java.util.Arrays;
import java.util.List;

public class LiveTemplate {
    //1.psvm  trigger the live template for the main method
    //2.sout trigger the live template for printing output
    //3.fori trigger the live template for a standard for-loop
    //4.ifn trigger the live template for null check
    //5.iter trigger the live template for an enhanced for loop
    //6 try catch

    public static void main(String[] args) {
        List<String> sampleList = null;
        try {
            sampleList = Arrays.asList("One,Two", "Three");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    try {
        
    } catch (Exception e) {
         //logger.error(e.getMessage());
    }
    

        for (String s : sampleList) {
            
        }


    }
}
