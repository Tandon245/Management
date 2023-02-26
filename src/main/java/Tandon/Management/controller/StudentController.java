package Tandon.Management.controller;

import Tandon.Management.model.Student;
import Tandon.Management.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping("/addstudent")
    public Student addStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
    @GetMapping("/findbystudentid/{id}")
    public Student getStudentsById(@PathVariable int id) {
        return studentService.getStudentById(id);
    }
    @PutMapping("/updatestudent/{id}")
    public void updateStudent(@PathVariable int id,@RequestBody Student newStudent) {
        studentService.updateStudentById(id, newStudent);
    }

    @DeleteMapping("deletestudent/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping("/findallstudent")
    public List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }



}