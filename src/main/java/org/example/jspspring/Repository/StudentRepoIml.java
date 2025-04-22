package org.example.jspspring.Repository;

import jakarta.annotation.PostConstruct;
import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import org.example.jspspring.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Transactional
public class StudentRepoIml implements StudentRepo {

    @PersistenceUnit
    private EntityManagerFactory emf;

    private EntityManager em;

    @PostConstruct
    public void init() {
        // Initialiser l'EntityManagerFactory si @PersistenceUnit n'est pas injecté automatiquement
        if (emf == null) {
            emf = Persistence.createEntityManagerFactory("DB");
        }

        // Test de la connexion
        em = emf.createEntityManager();
        System.out.println("Connexion OK : " + em.isOpen());
        em.close();
    }

    public void addStudent(Student student) {
        em = emf.createEntityManager();
        try{
            em.getTransaction().begin();
            em.persist(student);
           em.getTransaction().commit();
        }
        finally {
            em.close();
        }
    }

    public Student findStudentById(int id) {
        em = emf.createEntityManager();
        try {
            return em.find(Student.class, id);
        } finally {
            em.close();
        }
    }

    public List<Student> getAllStudents() {
        em = emf.createEntityManager();
        try {
            return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
        } finally {
            em.close();
        }
    }


    @Override
    public Student findEmployeById(int id) {
        // This appears to be a naming inconsistency, but implementing as required
        // Reusing the findStudentById logic
        return findStudentById(id);
    }
}
