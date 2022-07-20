/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ASUS
 */
public class SalaryTelescopic1 {
    String empId;
    String empName;
    double basicSalary;
    double allowance; 

    public SalaryTelescopic1(String empId) {
        this.empId = empId;
    }

    public SalaryTelescopic1(String empId, String empName) {
        this(empId);
        this.empName = empName;
    }

    public SalaryTelescopic1(String empId, String empName, double basicSalary) {
        this(empId,empName);
        this.basicSalary = basicSalary;
    }

    public SalaryTelescopic1(String empId, String empName, double basicSalary, double allowance) {
        this(empId,empName,basicSalary);
        this.allowance = allowance;
    }

    @Override
    public String toString() {
        return "SalaryTelescopic1{" + "empId=" + empId + ", empName=" + empName + ", basicSalary=" + basicSalary + ", allowance=" + allowance + '}';
    }
   
  
}
