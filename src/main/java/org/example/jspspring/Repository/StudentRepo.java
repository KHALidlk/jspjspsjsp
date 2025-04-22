package org.example.jspspring.Repository;
import org.example.jspspring.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepo {
    public void addStudent(Student student);
    public Student findEmployeById(int id) ;
    public List<Student> getAllStudents() ;
    }