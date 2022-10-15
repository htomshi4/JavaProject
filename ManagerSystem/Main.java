/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ManagerSystem;

/**
 *
 * @author mexawo3tebi
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        
        Employee [] worker = new Employee[10];
        
        // String name, String address, String job_title, String departement, double salary;
        
        // String name, String address, String job_title, String departement, double salary
        worker[0] = new Employee("hatim","khobar","CS","A",10000);
        
        
                System.out.println(worker[0].getName());

    }


    
}
