/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChangeOfRes;

/**
 *
 * @author ASUS
 */
public abstract class Handler{
    protected Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public abstract double applyTax(Invoice invoice);
    
}
