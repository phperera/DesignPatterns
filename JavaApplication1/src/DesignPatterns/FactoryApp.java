/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

/**
 *
 * @author ASUS
 */
public class FactoryApp {
    public static void main(String[] args) {
      Package aPackage = PackageFactory.createPackage(PackageCode.BASIC);
        System.out.println(aPackage);
        
       Package aPackage1 = PackageFactory.createPackage(PackageCode.PLATINUM);
        System.out.println(aPackage1);
    }
}
