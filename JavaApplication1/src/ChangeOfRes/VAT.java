/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class VAT extends Handler{
  
    @Override
    public double applyTax(Invoice invoice) {
         invoice.setTax(invoice.getAmount()*0.01);
   
   if (invoice.getAmount()<= 100.0){
   return invoice.getTax();
   }
   else
   {
        return successor.applyTax(invoice);
    }
    }
}
