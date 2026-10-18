package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Contrat;
import tn.esprit.autolocapi.service.IContratService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrats")
public class ContratController {

    private final IContratService iContratService;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat contrat) {
        return iContratService.addContrat(contrat);
    }

    @PutMapping("/updateContrat")
    public Contrat updateContrat(@RequestBody Contrat contrat) {
        return iContratService.updateContrat(contrat);
    }

    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id) {
        iContratService.deleteContrat(id);
    }

    @GetMapping("/getContratById/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return iContratService.getContratById(id);
    }

    @GetMapping("/getAllContrats")
    public List<Contrat> getAllContrats() {
        return iContratService.getAllContrats();
    }
}