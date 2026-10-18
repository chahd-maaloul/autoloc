package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Vehicle;

import java.util.List;

public interface IVehiculeService {
    public Vehicle ajouterVehicule(Vehicle vehicle);

    public Vehicle modifierVehicule(Vehicle vehicle);

    public void supprimerVehiculeById(long id);

    public Vehicle getVehiculeById(Long id);

    public List<Vehicle> getAllVehicles();


}
