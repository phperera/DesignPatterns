/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package designpatterns;


/**
 *
 * @author ASUS
 */
public class IdGenerator {

    private static volatile IdGenerator id = new IdGenerator() ;
    private IdGenerator() {
        if(id != null ){
            throw new RuntimeException("please use getIdGenerator Method");
        
    }
    }
    public static IdGenerator getIdGenerator(){
    
        return id;
   
    }
}
