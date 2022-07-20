/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prototype;

/**
 *
 * @author ASUS
 */
public class SchoolStudent extends Student {
    private String schoolName;
    private int grade;

    public String getSchoolName() {
        return schoolName;
    }

    public int getGrade() {
        return grade;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "schoolStudent{" + "schoolName=" + schoolName + ", grade=" + grade + '}';
    }
    
   
}
