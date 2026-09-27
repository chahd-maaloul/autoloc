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

    // ✅ Le CommandLineRunner s'écrit ICI, dans la classe principale
    @Bean
    CommandLineRunner initData(VehicleRepository vehicleRepository) {
        return args -> {
            if (vehicleRepository.count() == 0) {
                vehicleRepository.save(new Vehicle(null, "123TU4567", "Peugeot",
                        "208", CategorieVehicle.CITADINE,
                        new BigDecimal("80.00"), StatutVehicle.DISPONIBLE));

                vehicleRepository.save(new Vehicle(null, "789TU1234", "Renault",
                        "Clio", CategorieVehicle.CITADINE,
                        new BigDecimal("75.00"), StatutVehicle.LOUE));

                vehicleRepository.save(new Vehicle(null, "456TU7890", "Toyota",
                        "RAV4", CategorieVehicle.SUV,
                        new BigDecimal("150.00"), StatutVehicle.MAINTENANCE));

                System.out.println("✅ 3 véhicules de démonstration insérés.");
            }
        };
    }
}