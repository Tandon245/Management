package Tandon.Management.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_age")
    private String age;
    @Column(name="phonenumber")
    private String phoneNumber;
    @Column(name="student_branch")
    private String branch;
    @Column(name="student_dept")
    private String department;

    @Embedded
    private Address address;

}