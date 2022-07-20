/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class BTT extends Handler{

    @Override
    public double applyTax(Invoice invoice) {
        invoice.setTax(invoice.getAmount()*0.03);
        System.out.println("BTT calculated");
    // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
     if (invoice.getAmount()> 200.0 && invoice.getAmount()<=300.0){
 
   return invoice.getTax();
   }
   else
   {
        return successor.applyTax(invoice);
   }}
    
}
