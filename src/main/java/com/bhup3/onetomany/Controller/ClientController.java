package com.bhup3.onetomany.Controller;

import com.bhup3.onetomany.Entity.Client;
import com.bhup3.onetomany.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {
    @Autowired
    ClientService service;

    @GetMapping("/getData")
    public List<Client> getAll(){
        return service.getAll();
    }
    @GetMapping("/getData/{id}")
    public Client getData(@PathVariable Long id){
        Client client = service.getData(id);
        return client;
    }
    @PostMapping("/create")
    public String create(@RequestBody Client client){
        service.create(client);
        return "Data Successfully Created";
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "Delete Data Successfully";
    }
    @PutMapping("/update/{id}")
    public Client update(@PathVariable Long id, @RequestBody Client client){
        service.update(id, client);
        return client;

    }
}
