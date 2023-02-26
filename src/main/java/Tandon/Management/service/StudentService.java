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
        stud.setStudentId(newStudent.getStudentId());
        stud.setStudentName(newStudent.getStudentName());
        stud.setStudentAge(newStudent.getStudentAge());
        stud.setStudentBranch(newStudent.getStudentBranch());
        stud.setStudentDepartment(newStudent.getStudentDepartment());
        stud.setPhoneNumber(newStudent.getPhoneNumber());
        stud.setStudentAddress(newStudent.getStudentAddress());

        studentRepository.save(stud);
    }
    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

}