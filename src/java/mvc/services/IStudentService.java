/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.services;

import java.util.List;
import mvc.entities.Student;

/**
 *
 * @author Administrator
 */
public interface IStudentService {
    List<Student> getAllStudents();
    Student getStudent(int studentId);
    void saveStudent(Student student);
    void deleteStudent(int studentId);
}
