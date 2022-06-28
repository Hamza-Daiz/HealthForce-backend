package ma.ensa.backendhealthforce;

import ma.ensa.backendhealthforce.controllers.AuthController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class BackendHealthforceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendHealthforceApplication.class, args);
    }



}
