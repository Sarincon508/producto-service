package co.empresa.productoservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "co.empresa.productoservice")
@EnableJpaRepositories(basePackages = "co.empresa.productoservice")
@EntityScan(basePackages = "co.empresa.productoservice")
public class ProductoServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductoServiceApplication.class, args);
    }
}