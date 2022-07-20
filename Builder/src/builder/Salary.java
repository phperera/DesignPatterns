/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package builder;

/**
 *
 * @author ASUS
 */
public class Salary {

    private final String empId;
    private final String empName;
    private final double basicSalary;
    private final double allowance;

    public Salary(Builder builder ) {
        this.empId = builder.empId;
        this.empName = builder.empName;
        this.basicSalary = builder.basicSalary;
        this.allowance = builder.allowance;
    }
    
    
    /**
     * @param args the command line arguments
     */
   static class Builder{
    
    private  String empId;
    private String empName;
    private  double basicSalary;
    private double allowance;

        public Builder(String empId) {
            this.empId = empId;
        }

       
    public Builder(String empId, double basicSalary) {
            this.empId = empId;
            this.basicSalary = basicSalary;
        }
        
    public Salary build(){
        return new Salary(this);
  }
     
  public Builder empName(String empName){
  this.empName=empName;
  return this;
  }
  
  public Builder basicSalary(double basicSalary){
  this.basicSalary=basicSalary;
  return this;
  }
  public Builder allowance(double allowance ){
  this.allowance=allowance;
  return this;
        
  
  } 

        @Override
        public String toString() {
            return "Builder{" + "empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", allowance=" + allowance + '}';
        }

   
    
}
}
