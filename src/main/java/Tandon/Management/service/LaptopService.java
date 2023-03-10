package Tandon.Management.service;


import Tandon.Management.model.Laptop;
import Tandon.Management.repository.ILaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
@Service
public class LaptopService {
    @Autowired
    private ILaptopRepository laptopRepository;

    //create
    public Laptop addLaptop(Laptop newLaptop) {
        return laptopRepository.save(newLaptop);
    }
    //get by id
    public Laptop getLaptopById(int id) {
        return laptopRepository.findById(id).get();
    }

    //get all
    public List<Laptop> getAllLaptop(){
        return laptopRepository.findAll();
    }

    //delete
    public void deleteLaptopById(int id) {
        laptopRepository.deleteById(id);
    }

    //update by id

    public void updateLaptopById(int id, Laptop newLaptop) {
        Laptop lap = laptopRepository.findById(id).get();
        lap.setLaptopBrand(newLaptop.getLaptopBrand());
        lap.setLaptopId(newLaptop.getLaptopId());
        lap.setLaptopName(newLaptop.getLaptopName());
        lap.setStudent(newLaptop.getStudent());
        lap.setLaptopPrice(newLaptop.getLaptopPrice());
        laptopRepository.save(lap);

    }

}