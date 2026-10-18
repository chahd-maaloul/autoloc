package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Paiement;
import tn.esprit.autolocapi.service.IPaiementService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiements")
public class PaiementController {

    private final IPaiementService iPaiementService;

    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement paiement) {
        return iPaiementService.addPaiement(paiement);
    }

    @PutMapping("/updatePaiement")
    public Paiement updatePaiement(@RequestBody Paiement paiement) {
        return iPaiementService.updatePaiement(paiement);
    }

    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id) {
        iPaiementService.deletePaiement(id);
    }

    @GetMapping("/getPaiementById/{id}")
    public Paiement getPaiementById(@PathVariable Long id) {
        return iPaiementService.getPaiementById(id);
    }

    @GetMapping("/getAllPaiements")
    public List<Paiement> getAllPaiements() {
        return iPaiementService.getAllPaiements();
    }
}