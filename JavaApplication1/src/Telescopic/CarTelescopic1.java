/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telescopic;

/**
 *
 * @author ASUS
 */
public class CarTelescopic1 {
  String insurance;
  Boolean etc;
  String roadAssistance;
  String dropOffLocation;

    public CarTelescopic1(String insurance) {
        this.insurance = insurance;
    }

    public CarTelescopic1(String insurance, Boolean etc) {
        this(insurance);
        this.etc = etc;
    }

    public CarTelescopic1(String insurance, Boolean etc, String roadAssistance) {
        this(insurance,etc);
        this.roadAssistance = roadAssistance;
    }

    public CarTelescopic1(String insurance, Boolean etc, String roadAssistance, String dropOffLocation) {
        this(insurance,etc,roadAssistance);
        this.dropOffLocation = dropOffLocation;
    }

    @Override
    public String toString() {
        return "CarTelescopic1{" + "insurance=" + insurance + ", etc=" + etc + ", roadAssistance=" + roadAssistance + ", dropOffLocation=" + dropOffLocation + '}';
    }
  
  
}
