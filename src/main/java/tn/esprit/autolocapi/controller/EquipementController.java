package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Equipement;
import tn.esprit.autolocapi.service.IEquipementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipements")
public class EquipementController {

    private final IEquipementService iEquipementService;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement) {
        return iEquipementService.addEquipement(equipement);
    }

    @PutMapping("/updateEquipement")
    public Equipement updateEquipement(@RequestBody Equipement equipement) {
        return iEquipementService.updateEquipement(equipement);
    }

    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id) {
        iEquipementService.deleteEquipement(id);
    }

    @GetMapping("/getEquipementById/{id}")
    public Equipement getEquipementById(@PathVariable Long id) {
        return iEquipementService.getEquipementById(id);
    }

    @GetMapping("/getAllEquipements")
    public List<Equipement> getAllEquipements() {
        return iEquipementService.getAllEquipements();
    }
}