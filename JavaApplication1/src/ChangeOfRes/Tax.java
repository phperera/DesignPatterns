/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class Tax extends Handler{

    @Override
    public double applyTax(Invoice invoice) {
     return successor.applyTax(invoice);
    }
    
}
