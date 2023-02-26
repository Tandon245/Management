package Tandon.Management.repository;

import Tandon.Management.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepository extends JpaRepository<Laptop,Integer> {
}
