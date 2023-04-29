package kodlama.io.rentacar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class RentACarApplication {
    public static void main(String[] args) {
        SpringApplication.run(RentACarApplication.class, args);
    }
}
