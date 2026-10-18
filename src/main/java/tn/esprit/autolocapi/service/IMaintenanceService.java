package tn.esprit.autolocapi.service;

import tn.esprit.autolocapi.domain.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    Maintenance updateMaintenance(Maintenance maintenance);
    void deleteMaintenance(Long id);
    Maintenance getMaintenanceById(Long id);
    List<Maintenance> getAllMaintenances();
}