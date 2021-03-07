/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.dao;

import mvc.entities.Student;
import java.util.List;

/**
 *
 * @author Administrator
 */
public interface IStudentDao {
    List<Student> getAll();
    void saveStudent(Student student);
    Student getStudent(int studentId);
    void deleteStudent(int studentId);
}
