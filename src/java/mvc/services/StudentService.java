/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.services;

import java.util.List;
import mvc.dao.IStudentDao;
import mvc.entities.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Administrator
 */
@Service
public class StudentService implements IStudentService{

    @Autowired
    private IStudentDao studentDao;
    
    @Override
    @Transactional
    public List<Student> getAllStudents() {
        return studentDao.getAll();
    }

    @Override
    @Transactional
    public Student getStudent(int studentId) {
        return studentDao.getStudent(studentId);
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDao.saveStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int studentId) {
        studentDao.deleteStudent(studentId);
    }
    
}
