/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class Invoice {
    private int invoiveNumber;
    private double amount;
    private double tax;

    protected void setTax(double tax) {
        this.tax = tax;
    }

    public Invoice(int invoiveNumber, double amount) {
        this.invoiveNumber = invoiveNumber;
        this.amount = amount;
    }

    public int getInvoiveNumber() {
        return invoiveNumber;
    }

    public double getAmount() {
        return amount;
    }

    public double getTax() {
        return tax;
    }
    

    
   
    
    
}
