package tn.esprit.autolocapi.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.repository.VehicleRepository;
import tn.esprit.autolocapi.service.IVehiculeService;
import tn.esprit.autolocapi.domain.Vehicle;
import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/vehicules")

public class VehicleController {
    private  final IVehiculeService iVehiculeService;

    @PostMapping ("/ajouterVehicule")
    public Vehicle ajouterVehicule(@RequestBody Vehicle vehicle) {
        return iVehiculeService.ajouterVehicule(vehicle);
    }
    @PutMapping("/modifierVehicule")
    public Vehicle modifierVehicule(@RequestBody Vehicle vehicle) {
        return iVehiculeService.modifierVehicule(vehicle);
    }

    @DeleteMapping("/supprimerVehiculeById/{id}")
    public void supprimerVehicule( @PathVariable Long id) {
        iVehiculeService.supprimerVehiculeById(id);
    }
    @GetMapping("/recuperer/{id}")
    public Vehicle getVehiculeById(@PathVariable Long id){
        return iVehiculeService.getVehiculeById(id);
    }
    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicule() {
        return iVehiculeService.getAllVehicles();
    }
}
