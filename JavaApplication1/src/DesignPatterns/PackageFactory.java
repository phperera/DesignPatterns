/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

/**
 *
 * @author ASUS
 */
public class PackageFactory {
    public static Package createPackage(PackageCode packageCode){
    
        switch(packageCode){
            case BASIC:
                return new BasicPackage();
            case SILVER:
                return new SilverPackage();
            case PLATINUM:
                return new PlatinumPackage();
            default:
                return null;
        }
    }}

