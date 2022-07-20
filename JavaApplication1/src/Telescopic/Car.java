/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telescopic;

/**
 *
 * @author ASUS
 */
public class Car {
  private final  String insurance;
  private final Boolean etc;
  private final String roadAssistance;
  private final String dropOffLocation;
  
 public Car(Builder builder){
   
      this.insurance=builder.insurance;
      this.dropOffLocation=builder.dropOffLocation;
      this.roadAssistance=builder.roadAssistance;
      this.etc=builder.etc;
  
     
 }
  
 
 static class Builder{
  private  String insurance;
  private Boolean etc;
  private String roadAssistance;
  private String dropOffLocation;
  
  public Builder(String insurance){
      this.insurance=insurance;
  }
  public Car build(){
  return new Car(this);
  }
  //it will take etc and assigns to Boolean etc
  public Builder etc(Boolean etc){
  this.etc=etc;
  return this;
  }
  
  public Builder roadAssistance(String roadAssistance){
  this.roadAssistance=roadAssistance;
  return this;
  }
  public Builder dropOffLocation(String dropOffLocation ){
  this.dropOffLocation=dropOffLocation;
  return this;
        
  
  } 
 }

    @Override
    public String toString() {
        return "Car{" + "insurance=" + insurance + ", etc=" + etc + ", roadAssistance=" + roadAssistance + ", dropOffLocation=" + dropOffLocation + '}';
    }
  
}