/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controllers;

import mvc.dao.IStudentDao;
import mvc.entities.Student;
import java.util.List;
import mvc.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Administrator
 */
@Controller
@RequestMapping("/test")
public class StudentController {

    @Autowired
    private IStudentService studentService;
    
    @RequestMapping("")
    public String index(Model model) {
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student";
    }
    
    @RequestMapping("/add")
    public String addStudent(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        
        return "student-form";
    }
    
    @RequestMapping("/edit")
    public String updateStudent(@RequestParam("student_id") int studentId, Model model) {
        Student student = studentService.getStudent(studentId);
        model.addAttribute("student", student);
        return "student-form";
    }
    
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/test";
    }
    
    @RequestMapping("/delete")
    public String deleteStudent(@RequestParam("student_id") int studentId) {
        studentService.deleteStudent(studentId);
        return "redirect:/test";
    }
    
    
}
