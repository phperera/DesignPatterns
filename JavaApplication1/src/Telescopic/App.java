/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telescopic;

/**
 *
 * @author ASUS
 */
public class App {
    public static void main(String[] args) {
    
   CarTelescopic1 carTelescopic1 =new CarTelescopic1("full");
   System.out.println(carTelescopic1);
    
    CarTelescopic2 carTelescopic2 = new CarTelescopic2("full");
    System.out.println(carTelescopic2);
    
    Car.Builder builder = new Car.Builder("full");
    Car cars = builder.dropOffLocation("LA").roadAssistance("RA").build();
    System.out.println(cars);
    }
}
