package lfe.sample.navigation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class LoggerSample {
    private static final Logger logger = LoggerFactory.getLogger(LoggerSample.class);

    public void sampleLog(){
        // Sample 1: Basic logging with string concatenation
        System.out.println("Starting data processing...");

        // Sample 2: Logging with exception details
        try {
            // ... some code that might throw an exception ...
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        // Sample 3: Debugging information with variable values
        int count = 100;
        System.out.println("Number of items: " + count);

        // Sample 4: Inconsistent formatting and lack of context
        System.out.println("Order placed successfully!");
    }
}
