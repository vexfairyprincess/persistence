package dao;

import interfaces.IsStudent;
import jakarta.persistence.EntityManager;
import models.Student;

import java.util.List;

public class StudentDAO implements IsStudent {
    @Override
    public void save(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.persist(student);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public Student getStudent(Long id) {
        EntityManager em = EntityManagerAdmin.getInstance();
        return em.find(Student.class, id);
    }

    @Override
    public void update(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.merge(student);
        em.getTransaction().commit();
    }

    @Override
    public void delete(Student student) {
        EntityManager em = EntityManagerAdmin.getInstance();
        em.getTransaction().begin();
        em.remove(student);
        em.getTransaction().commit();

    }

    @Override
    public List<Student> getStudents() {
        return null;
    }
}
