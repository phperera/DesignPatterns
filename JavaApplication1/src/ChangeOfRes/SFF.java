/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class SFF extends Handler {

    @Override
    public double applyTax(Invoice invoice) {
        
        invoice.setTax(invoice.getAmount()*0.04);
        System.out.println("SFF calculated");

    
   return invoice.getTax();
   
    }
}
