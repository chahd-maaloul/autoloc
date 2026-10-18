package tn.esprit.autolocapi.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autolocapi.domain.Vehicle;
import tn.esprit.autolocapi.repository.VehicleRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class IVehicleServiceImpl  implements IVehiculeService {

   /* @Autowired
    private VehicleRepository vehicleRepository;*/
    private  final VehicleRepository vehicleRepository;

    @Override
    public Vehicle ajouterVehicule(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle modifierVehicule(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }




    @Override
    public Vehicle getVehiculeById(Long id) {

        return vehicleRepository.findById(id).orElse(null);

    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public void supprimerVehiculeById(long id){
        vehicleRepository.deleteById(id);
    }

}
