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

    public Person(String name, String address, String job_title, String departement, double salary) {
        this.name = name;
        this.address = address;
        this.job_title = job_title;
        this.departement = departement;
        this.salary = salary;
    }
    
  
    

    void setName(String name) {
        this.name = name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    void setDepartement(String departement) {
        this.departement = departement;
    }

    String getName() {
        return name;
    }

    String getAddress() {
        return address;
    }

    String getJob_title() {
        return job_title;
    }

    String getDepartement() {
        return departement;
    }
    Person(){
        
    }

    
}
