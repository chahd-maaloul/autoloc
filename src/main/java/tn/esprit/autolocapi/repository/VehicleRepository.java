package tn.esprit.autolocapi.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autolocapi.domain.Vehicle;
@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
}