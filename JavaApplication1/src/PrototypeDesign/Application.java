/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypeDesign;

/**
 *
 * @author ASUS
 */
public class Application {
    public static void main(String[] args) {
        Registry registry = new Registry();
        
        //new keyword is not used. we used a registry
        Car car  = (Car)registry.getVehicle(VehicleType.CAR);
        System.out.println(car);
        
        car.setType("lux");
        System.out.println(car);
        
        Car car1  = (Car)registry.getVehicle(VehicleType.CAR);
        System.out.println(car1);
       
    }
}
