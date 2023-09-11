package kz.java.clientcoreapi.controller;

import jakarta.validation.Valid;
import kz.java.clientcoreapi.model.ClientModel;
import kz.java.clientcoreapi.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @PostMapping("/{clientId}")
    public ResponseEntity<String> createClient(@Valid @RequestBody ClientModel clientModel){
        clientService.createClient(clientModel);
        return new ResponseEntity<String>("succesfully Created", HttpStatus.OK);
    }
    @DeleteMapping("/{clientId}")
    public ResponseEntity<String> deleteClient(@PathVariable String clientId){
        clientService.deleteClient(clientId);
        return new ResponseEntity<String>("Succesfully Deleted!", HttpStatus.OK);
    }
    @PutMapping("/{clientId}")
    public ResponseEntity<String> updateClient(@PathVariable String clientId,@Valid @RequestBody ClientModel clientModel){
        clientService.updateClient(clientId, clientModel);
        return new ResponseEntity<>("Succesfully Updated!",  HttpStatus.OK);
    }
    @GetMapping("/all")
    public List<ClientModel> getAllClient(){
        return clientService.getAllClient();
    }
}
