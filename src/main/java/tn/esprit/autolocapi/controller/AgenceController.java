package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Agence;
import tn.esprit.autolocapi.service.IAgenceService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agences")
public class AgenceController {

    private final IAgenceService iAgenceService;

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence agence) {
        return iAgenceService.addAgence(agence);
    }

    @PutMapping("/updateAgence")
    public Agence updateAgence(@RequestBody Agence agence) {
        return iAgenceService.updateAgence(agence);
    }

    @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id) {
        iAgenceService.deleteAgence(id);
    }

    @GetMapping("/getAgenceById/{id}")
    public Agence getAgenceById(@PathVariable Long id) {
        return iAgenceService.getAgenceById(id);
    }

    @GetMapping("/getAllAgences")
    public List<Agence> getAllAgences() {
        return iAgenceService.getAllAgences();
    }
}