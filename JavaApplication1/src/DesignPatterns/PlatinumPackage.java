/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

/**
 *
 * @author ASUS
 */
public class PlatinumPackage extends Package {

    @Override
    protected void createPackage() {
       decorations.add(new BridalDeco());
        decorations.add(new BridesMaidDeco());
        decorations.add(new ParentDeco());
        decorations.add(new FlowerGirlDeco());
    }
    
}
