/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

/**
 *
 * @author ASUS
 */
public class Test {
    public static void main(String[] args) {
        
        long start;
        long end;
        
        DBManager dbManager=DBManager.getDbManager();
        System.out.println(dbManager);
        
        start=System.currentTimeMillis();
        DBManager dbManager1=DBManager.getDbManager();
        System.out.println(dbManager1);
        
        //eventhough 2 instances are created only 1 is created
    }
}
