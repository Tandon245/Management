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
    private int studentId;
    @Column(name="student_name")
    private String studentName;
    @Column(name="student_age")
    private String studentAge;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="student_branch")
    private String studentBranch;
    @Column(name="student_dept")
    private String studentDepartment;

    @Embedded
    private Address studentAddress;


}