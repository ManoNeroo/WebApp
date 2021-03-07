/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao;

import mvc.entities.Student;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Administrator
 */
@Repository
public class StudentDao implements IStudentDao {

    @Autowired
    private SessionFactory factory;

    @Override
    public List<Student> getAll() {
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("from Student");
        List<Student> students = query.list();
        return students;
    }

    // them va cap nhat
    @Override
    public void saveStudent(Student student) {
        Session session = factory.getCurrentSession();
        session.saveOrUpdate(student);
    }

    @Override
    public Student getStudent(int studentId) {
        Session session = factory.getCurrentSession();
        Student student = (Student) session.get(Student.class, studentId);
        return student;
    }

    @Override
    public void deleteStudent(int studentId) {
        Session session = factory.getCurrentSession();
        Query query = session.createQuery("delete from Student where student_id=:studentId");
        query.setParameter("studentId", studentId);
        query.executeUpdate();
    }

}
