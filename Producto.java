/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarealabo2;

/**
 *
 * @author ricky
 */
public class Producto {
    private String Name;
    private int Price,Quant;

    
    //BASE CONSTRUCTOR
    public Producto(){
    }
   
    //PRO CONSTRUCTOR
    public Producto(String pName, int p, int q){
        this.Name = pName;
        this.Price = p;
        this.Quant = q;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getName() {
        return Name;
    }
    
    public int getPrice() {
        return Price;
    }
    
    public int getQuant() {
        return Quant;
    }

    //SETTERS
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public void setQuant(int Quant) {
        this.Quant = Quant;
    }
    
       
}

