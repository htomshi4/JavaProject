/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerSystem;

/**
 *
 * @author mexawo3tebi
 */
public class HR extends Person {

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public void setAddress(String address) {
        this.address = address;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setDepartement(String departement) {
        this.departement = departement;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
    public String getJob_title() {
        return job_title;
    }
    public String getDepartement() {
        return departement;
    }

    public HR(String name, String address, String job_title, String departement, double salary) {
        super(name, address, job_title, departement, salary);
    }



    public HR(){
        
    }
    @Override
    public String toString() {
        return """
               HR
               Name:""" + super.name + "\naddress:" + super.address + "\njob_title:" + super.job_title + "\ndepartement:" + super.departement + "\nsalary:" + super.salary ;
    }
    
    public boolean edit_employee (Employee s){
        
        return false;
        
    }
}
