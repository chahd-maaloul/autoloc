package tn.esprit.autolocapi.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autolocapi.domain.Client;
import tn.esprit.autolocapi.service.IClientService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/clients")
public class ClientController {

    private final IClientService iClientService;

    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client) {
        return iClientService.addClient(client);
    }

    @PutMapping("/updateClient")
    public Client updateClient(@RequestBody Client client) {
        return iClientService.updateClient(client);
    }

    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        iClientService.deleteClient(id);
    }

    @GetMapping("/getClientById/{id}")
    public Client getClientById(@PathVariable Long id) {
        return iClientService.getClientById(id);
    }

    @GetMapping("/getAllClients")
    public List<Client> getAllClients() {
        return iClientService.getAllClients();
    }
}