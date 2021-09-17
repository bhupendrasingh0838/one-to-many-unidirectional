package com.bhup3.onetomany.Service;

import com.bhup3.onetomany.Entity.Client;
import com.bhup3.onetomany.Entity.Laptop;

import java.util.List;

public interface ClientService {

    public List<Client> getAll();

    public Client getData(Long id);

    public String   create(Client client);

    public void delete(Long id);

    public Client update(Long id,Client client);



}
