/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DesignPatterns;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class Package {
    protected List<Decoration> decorations = new ArrayList<>();

    public Package(){
      createPackage();
    }
    protected abstract void createPackage();
    
    @Override
    public String toString(){
    return "package{"+
            "decorartions"+decorations +
            "}";
    }
}
