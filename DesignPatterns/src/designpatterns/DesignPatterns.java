/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package designpatterns;

/**
 *
 * @author ASUS
 */
public class DesignPatterns {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IdGenerator id1 = IdGenerator.getIdGenerator();// TODO code application logic here
        System.out.println("instance 1 "+id1);
        
        IdGenerator id2 = IdGenerator.getIdGenerator();// TODO code application logic here
        System.out.println("instance 2 "+id2);
    }
    
}
