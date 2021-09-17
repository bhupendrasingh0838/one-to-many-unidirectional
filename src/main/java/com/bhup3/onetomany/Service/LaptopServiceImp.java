package com.bhup3.onetomany.Service;

import com.bhup3.onetomany.Entity.Client;
import com.bhup3.onetomany.Entity.Laptop;
import com.bhup3.onetomany.Repository.ClientRepository;
import com.bhup3.onetomany.Repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LaptopServiceImp implements LaptopService{
        @Autowired
        LaptopRepository repository1;


    @Override
    public List<Laptop> getAllLap() {
        return (List<Laptop>) repository1.findAll();
    }

    @Override
    public Laptop getDataLap(Long id) {
        return repository1.findById(id).get();
    }

    @Override
    public String createLap(Laptop laptop) {
        repository1.save(laptop);
        return "laptop";
    }

    @Override
    public void deleteLap(Long id) {
        repository1.deleteById(id);

    }

    @Override
    public Laptop updateLap(Long id, Laptop laptop) {
        Laptop laptop1 = repository1.findById(id).get();
        laptop1.setLaptopName(laptop.getLaptopName());
        laptop1.setProcessor(laptop.getProcessor());
        repository1.save(laptop1);
        return laptop1;
    }
}
