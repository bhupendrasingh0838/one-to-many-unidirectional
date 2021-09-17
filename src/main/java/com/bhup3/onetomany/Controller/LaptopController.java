package com.bhup3.onetomany.Controller;

import com.bhup3.onetomany.Entity.Laptop;
import com.bhup3.onetomany.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    @Autowired
    LaptopService service1;

    @GetMapping("/getDataLAP")
    public List<Laptop> getAllLap(){
        return service1.getAllLap();
    }
    @GetMapping("/getDataLAP/{id}")
    public Laptop getDataLap(@PathVariable Long id){
        Laptop laptop = service1.getDataLap(id);
        return laptop;
    }
    @PostMapping("/createLAP")
    public String createLap(@RequestBody Laptop laptop){
        service1.createLap(laptop);
        return "Data Successfully Created";
    }
    @DeleteMapping("/deleteLAP/{id}")
    public String  deleteLap(@PathVariable Long id){
        service1.deleteLap(id);
        return "Delete Data Successfully";
    }
    @PutMapping("/updateLAP/{id}")
    public Laptop updateLap(@PathVariable Long id, @RequestBody Laptop laptop){
        service1.updateLap(id,laptop);
        return laptop;

    }
}
