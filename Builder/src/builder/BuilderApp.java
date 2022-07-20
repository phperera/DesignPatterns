/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder;

/**
 *
 * @author ASUS
 */
public class BuilderApp {
    public static void main(String[] args) {
   SalaryTelescopic1 salTelescopic1 =new SalaryTelescopic1("Emp123");
   System.out.println(salTelescopic1);
    
 //   SalaryTelescopic2 salTelescopic2 = new SalaryTelescopic2("Emp223");
   // System.out.println(salTelescopic2);
    
    Salary.Builder builder = new Salary.Builder("Emp333");
    Salary sals = builder.empName("john").basicSalary(2000.0).allowance(5000.0).build();
    System.out.println(sals);
    }
}
