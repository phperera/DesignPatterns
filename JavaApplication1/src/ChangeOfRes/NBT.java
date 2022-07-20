/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public class NBT extends Handler {
    
    @Override
    public double applyTax(Invoice invoice){
    invoice.setTax(invoice.getAmount()*0.02);
        System.out.println("NBT calculated");
   if (invoice.getAmount()> 100.0 && invoice.getAmount()<=200.0){
 
   return invoice.getTax();
   }
   else
   {
        return successor.applyTax(invoice);
   }}
}
