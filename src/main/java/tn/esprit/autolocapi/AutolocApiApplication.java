package tn.esprit.autolocapi;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import tn.esprit.autolocapi.domain.CategorieVehicle;
import tn.esprit.autolocapi.domain.StatutVehicle;
import tn.esprit.autolocapi.domain.Vehicle;
import tn.esprit.autolocapi.repository.VehicleRepository;

import java.math.BigDecimal;

@SpringBootApplication
public class AutolocApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutolocApiApplication.class, args);
    }
}