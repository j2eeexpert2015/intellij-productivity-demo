package lfe.sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudBackendApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudBackendApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }
}
