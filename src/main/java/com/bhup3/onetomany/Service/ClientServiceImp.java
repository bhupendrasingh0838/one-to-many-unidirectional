package com.bhup3.onetomany.Service;

import com.bhup3.onetomany.Entity.Client;
import com.bhup3.onetomany.Entity.Laptop;
import com.bhup3.onetomany.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImp implements ClientService {
    @Autowired
    ClientRepository repository;

    @Override
    public List<Client> getAll() {
        return (List<Client>) repository.findAll();
    }

    @Override
    public Client getData(Long id) {
        return repository.findById(id).get();

    }

    @Override
    public String create(Client client) {
        repository.save(client);
        return "Data created";
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);

    }

    @Override
    public Client update(Long id, Client client) {
        Client client1 = repository.findById(id).get();
        client1.setName(client.getName());
        client1.setEmail(client.getEmail());
        repository.save(client1);
                return client1;
    }
}
