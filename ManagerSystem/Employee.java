/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerSystem;

/**
 *
 * @author mexawo3tebi
 */
public class Employee extends Person {

    @Override
    public String toString() {
        return """
               Employee
               Name:""" + super.name + "\naddress:" + super.address + "\njob_title:" + super.job_title + "\ndepartement:" + super.departement + "\nsalary:" + super.salary ;
    }
    
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    @Override
    public void setDepartement(String departement) {
        this.departement = departement;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getAddress() {
        return address;
    }
    @Override
    public String getJob_title() {
        return job_title;
    }
    @Override
    public String getDepartement() {
        return departement;
    }

    public Employee(String name, String address, String job_title, String departement, double salary) {
        super(name, address, job_title, departement, salary);
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public void setSalary(double salary) {
        this.salary = salary;
    }

    Employee(){
        
    }

}
