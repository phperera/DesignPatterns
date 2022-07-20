/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrototypeDesign;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class Registry {
  private Map<VehicleType, Vehicle> vehicles = new HashMap<>();  

    public Registry() {
        this.initialize();
        
    }
    public Vehicle getVehicle(VehicleType vehicleType)
    {
        Vehicle vehicle = null;
    
      try {
           vehicle = (Vehicle) vehicles.get(vehicleType).clone();
          
      } catch (CloneNotSupportedException ex) {
          Logger.getLogger(Registry.class.getName()).log(Level.SEVERE, null, ex);
      }
      return vehicle;
    }
private void intialize(){
    Car car = new Car();
    car.setEngineCapacity(2000);
    car.setType("mini");
    
     Bus bus = new Bus();
     bus.setNumberOfSeats(32);
     bus.setEngineCapacity(3000);
     bus.setFuelType("Disel");
     
     vehicles.put(VehicleType.CAR, car);
     vehicles.put(VehicleType.BUS, car);

    }

    private void initialize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 
}
