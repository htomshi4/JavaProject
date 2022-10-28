/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManagerSystem;

/**
 *
 * @author mexawo3tebi
 */
class Person {
    String name,address,job_title,departement;
    double salary;

    public Person(String name, String address, String job_title, String departement, double salary) {
        this.name = name;
        this.address = address;
        this.job_title = job_title;
        this.departement = departement;
        this.salary = salary;
        
        
    }
    

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", address=" + address + ", job_title=" + job_title + ", departement=" + departement + ", salary=" + salary + '}';
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


  
    
    Person(){
        
    }

    
}
