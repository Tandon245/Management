package Tandon.Management.controller;

import Tandon.Management.model.Laptop;
import Tandon.Management.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class LaptopController {
    @Autowired
    private LaptopService laptopService;

    //add
    @PostMapping("/add")
    public Laptop addLaptop(@RequestBody Laptop laptop) {
        return laptopService.addLaptop(laptop);
    }

    //get by id
    @GetMapping("/findbyid/{id}")
    public Laptop getLaptopById(@PathVariable int id) {
        return laptopService.getLaptopById(id);
    }


    //update
    @PutMapping("/updatelaptop/{id}")
    public void updateLaptop(@PathVariable int id,@RequestBody Laptop newLaptop) {
        laptopService.updateLaptopById(id, newLaptop);
    }

    //delete student by id

    @DeleteMapping("delete/{id}")
    public void deleteLaptop(@PathVariable int id) {
        laptopService.deleteLaptopById(id);
    }

    //get all

    @GetMapping("/findall")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptop();
    }

}