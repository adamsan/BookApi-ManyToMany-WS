package com.example.bookapimanytomany;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@OpenAPIDefinition(
        info = @Info(
                title = "Books Api",
                version = "0.1",
                description = "Practice Api for building REST Api with many-to-many relationships",
                license = @License(name = "All rights reserved."),
                contact = @Contact(name="Jacob Gibbs", email = "noreply@foobar.com")
        )
)
@SpringBootApplication
public class BookApiManyToManyApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookApiManyToManyApplication.class, args);
    }

}
