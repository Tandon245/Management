package Tandon.Management.service;


import Tandon.Management.model.Student;
import Tandon.Management.repository.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class StudentService {
    @Autowired
    private IStudentRepository studentRepository;
    public Student addStudent(Student newStudent) {
        return studentRepository.save(newStudent);
    }
    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

    public List<Student> getAllStudent(){
        return studentRepository.findAll();
    }
    public void updateStudentById(int id, Student newStudent) {
        Student stud = studentRepository.findById(id).get();
        stud.setId(newStudent.getId());
        stud.setName(newStudent.getName());
        stud.setAge(newStudent.getAge());
        stud.setBranch(newStudent.getBranch());
        stud.setDepartment(newStudent.getDepartment());
        stud.setPhoneNumber(newStudent.getPhoneNumber());
        stud.setAddress(newStudent.getAddress());

        studentRepository.save(stud);
    }
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

}