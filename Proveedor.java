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
public class Proveedor {
    private String Name;
    private String Adress;
    private String Company;
    private int Phone;

    
    //BASE CONSTRUCTOR
    public Proveedor(){
    }
   
    //PRO CONSTRUCTOR
    public Proveedor(String eName, String Ad,String Comp, int p){
        this.Name = eName;
        this.Adress = Ad;
        this.Company = Comp;
        this.Phone = p;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getName() {
        return Name;
    }
    
    public String getAdress() {
        return Adress;
    }

    public String getCompany() {
        return Company;
    }
    
    public int getPhone() {
        return Phone;
    }

    //SETTERS
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAdress(String Adress) {
        this.Adress = Adress;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }
    
       
}
