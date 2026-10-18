package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Maintenance;
import tn.esprit.autolocapi.service.IMaintenanceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenances")
public class MaintenanceController {

    private final IMaintenanceService iMaintenanceService;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance) {
        return iMaintenanceService.addMaintenance(maintenance);
    }

    @PutMapping("/updateMaintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance maintenance) {
        return iMaintenanceService.updateMaintenance(maintenance);
    }

    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id) {
        iMaintenanceService.deleteMaintenance(id);
    }

    @GetMapping("/getMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id) {
        return iMaintenanceService.getMaintenanceById(id);
    }

    @GetMapping("/getAllMaintenances")
    public List<Maintenance> getAllMaintenances() {
        return iMaintenanceService.getAllMaintenances();
    }
}