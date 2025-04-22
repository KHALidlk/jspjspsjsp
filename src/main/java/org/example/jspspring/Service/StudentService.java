package org.example.jspspring.Service;

import org.example.jspspring.Model.Student;
import org.example.jspspring.Repository.StudentRepoIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private StudentRepoIml studentRepo;

    public StudentService(StudentRepoIml studentRepo) {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student student) {
        studentRepo.addStudent(student);
    }
    
    public List<Student> getAllStudents() {
        return studentRepo.getAllStudents();
    }

    public Student findStudentById(int id) {
        return studentRepo.findStudentById(id);
    }

    public StudentRepoIml getStudentRepo() {
        return studentRepo;
    }

    public void setStudentRepo(StudentRepoIml studentRepo) {
        this.studentRepo = studentRepo;
    }
}
