package Tandon.Management.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_laptop")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int laptopId;
    @Column(name="laptop_name")
    private String laptopName;
    @Column(name="laptop_brand")
    private String laptopBrand;
    @Column(name="laptop_price")
    private int laptopPrice;

    @OneToOne
    private Student student;

}