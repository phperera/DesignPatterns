/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

/**
 *
 * @author ASUS
 */
public class PrototypeApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Registry registry = new Registry();
        
        SchoolStudent sch = (SchoolStudent) registry.getStudent(StudentType.SCHOOLSTUDENT);
        System.out.println(sch);
        
        sch.setName("Anne");
        sch.setSchoolName("XYZ College");
        System.out.println(sch);
        
        UniStudent uni = (UniStudent) registry.getStudent(StudentType.UNISTUDENT);
        System.out.println(uni);
        
        uni.setDegree("SE");
        System.out.println(uni);
    }   
    
}
