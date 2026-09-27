package tn.esprit.autolocapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autolocapi.domain.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}