package lfe.sample.navigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SSRSampleIssues {
    private static final Logger logger = LoggerFactory.getLogger(SSRSampleIssues.class);

    public static void main(String[] args) {

        // Sample 1: Completely Empty Catch Block
        try {
    FileReader reader = new FileReader("file.txt");
} catch (FileNotFoundException e) {
    logger.error("Exception caught: ", e);
}

        // Sample 2: Catch Block with Only a Comment
        try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    logger.error("Exception caught: ", e);
}

        // Sample 3: Catch Block with Print Statement (Not Proper Logging)
        try {
            FileReader reader = new FileReader("file.txt");
        } catch (IOException e) {
            logger.error("Exception caught: ", e);
            // Swallowed without proper logging or handling
        }

        // Sample 4: Catch Block with Suppression and No Logging
        try {
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            // Ignored, doing nothing with the exception
        }

        // Sample 5: Catch Block with Minimal Action
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb");
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            // Exception swallowed without logging the exception details
        }

        // Sample 6: Catch Block Rethrowing as a Generic Exception (Bad Practice)
        try {
            someOperation();
        } catch (IOException e) {
            throw new RuntimeException("An error occurred"); // Lost the original exception
        }

        // Sample 7: Empty Catch Block with Logging Comment (But No Logging Implemented)
        try {
    someOperation();
} catch (Exception e) {
    logger.error("Exception caught: ", e);
}
    }

    // Dummy method to simulate an operation that can throw IOException
    private static void someOperation() throws IOException {
        throw new IOException("Simulated IOException");
    }
}

