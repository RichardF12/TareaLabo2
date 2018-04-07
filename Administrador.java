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
public class Administrador {
    private String Name;
    private String Email;
    private String Company;
    private int Phone;
    private int age;

    
    //BASE CONSTRUCTOR
    public Administrador(){
    }
   
    //PRO CONSTRUCTOR
    public Administrador(String aName, String Email,String Comp, int p, int a){
        this.Name = aName;
        this.Email = Email;
        this.Company = Comp;
        this.Phone = p;
        this.age = a;
    }

    //SETTERS AND GETTERS
    
    //GETTERS
    public String getName() {
        return Name;
    }
    
    public String getEmail() {
        return Email;
    }

    public String getCompany() {
        return Company;
    }
    
    public int getPhone() {
        return Phone;
    }

    public int getAge() {
        return age;
    }
    
    //SETTERS
    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setCompany(String Company) {
        this.Company = Company;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public void setAge(int age) {
        this.age = age;
    }

       
}
    
