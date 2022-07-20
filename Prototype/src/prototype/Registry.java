/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Registry {
    private Map<StudentType, Student> students = new HashMap<>();

    public Registry() {
        this.initialize();
        
    }
    
    public Student getStudent(StudentType studentType){
        Student student =null;
        try {
             student = (Student) students.get(studentType).clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return student;
    }

    private void initialize() {
       UniStudent uni = new UniStudent() ; 
       uni.setDegree("physical science");
       uni.setYear(2);
       uni.setName("John");
       uni.setAge(23);
       uni.setsId("s141140");
       
       SchoolStudent sch = new SchoolStudent();
       sch.setSchoolName("ABC College");
       sch.setGrade(8);
       sch.setAge(12);
       
       students.put(StudentType.UNISTUDENT, sch);
       students.put(StudentType.SCHOOLSTUDENT, sch);
    }
    
    
}
