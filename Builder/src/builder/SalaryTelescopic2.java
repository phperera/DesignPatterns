/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ASUS
 */
public class SalaryTelescopic2 {
    String empId;
    String empName;
    double basicSalary;
    double allowance;

    public SalaryTelescopic2(String empId, String empName, double basicSalary, double allowance) {
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
    }

 

   
   
    @Override
    public String toString() {
        return "SalaryTelescopic2{" + "empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", allowance=" + allowance + '}';
    }
    
    
}
