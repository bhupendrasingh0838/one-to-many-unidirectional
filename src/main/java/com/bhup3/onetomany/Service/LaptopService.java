package com.bhup3.onetomany.Service;

import com.bhup3.onetomany.Entity.Client;
import com.bhup3.onetomany.Entity.Laptop;

import java.util.List;

public interface LaptopService {

    public List<Laptop> getAllLap();

    public Laptop getDataLap(Long id);

    public String   createLap(Laptop laptop);

    public void deleteLap(Long id);

    public Laptop updateLap(Long id,Laptop laptop);

}
