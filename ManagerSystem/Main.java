/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package ManagerSystem;

 import java.io.*;
import java.util.Arrays;
import java.util.Scanner; // Import the Scanner class to read text files

/**
 *
 * @author mexawo3tebi
 */
public class Main {

    public static void main(String[] args) {
        
      
        Employee [] worker = new Employee[100];
        HR [] hr_manager = new HR[100];
        
        System.out.print("Loading HR - Employees\n");
        //boolean is_load_hr =loadHr(hr_manager);
        //boolean is_load_employee = loadEmployee(worker);
        //if (is_load_hr && is_load_employee)
        worker[0] = new Employee("hatim","khobar","CS","A",1000);
        
        
        
        System.out.print(worker[0].toString());
        

        
        // String name, String address, String job_title, String departement, double salary;
        
        

    }
    static boolean loadHr(HR [] workers){
              int counter =0;
            boolean x = false;
            
   try{
    FileInputStream fstream = new FileInputStream("/Users/mexawo3tebi/NetBeansProjects/mavenproject1/src/main/java/ManagerSystem/employees.txt");
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    while ((strLine = br.readLine()) != null)   {
       String[] tokens = strLine.split(" ");
       double salary = Double.parseDouble(tokens[4]);  
       workers[counter] = new HR(tokens[0],tokens[1],tokens[2],tokens[3],salary);
       counter+=1;
       
    }
    x = true;
    in.close();
    } catch (Exception e){
      System.err.println("Error: " + e.getMessage());
    }
     return x;
     
    }
    
    
    static boolean loadEmployee(Employee [] workers){
              int counter =0;
               boolean x = false;
               
   try{
    FileInputStream fstream = new FileInputStream("/Users/mexawo3tebi/NetBeansProjects/mavenproject1/src/main/java/ManagerSystem/employees.txt");
    DataInputStream in = new DataInputStream(fstream);
    BufferedReader br = new BufferedReader(new InputStreamReader(in));
    String strLine;
    while ((strLine = br.readLine()) != null)   {
       String[] tokens = strLine.split(" ");
       double salary = Double.parseDouble(tokens[4]);  
       workers[counter] = new Employee(tokens[0],tokens[1],tokens[2],tokens[3],salary);
       counter+=1;
       
    }
    x = true;
    
    in.close();
    } catch (Exception e){
      System.err.println("Error: " + e.getMessage());
    }
       return x;
    }
    public void display_employee(Employee obj){
         System.out.println(obj.toString());

    }


    public static Employee edit_employee(Employee obj){
         System.out.println("- Edit Dashboard -");
         System.out.println("[1] For Name :");
         System.out.println("[2] For Address :");
         System.out.println("[3] For Department :");
         System.out.println("[4] For Job Title :");
         System.out.println("[5] For Salary :");
          System.out.println("Choice:");
          Scanner x = new Scanner(System.in);
          int choice = x.nextInt();
           System.out.println("New Value:");

          switch (choice){
              case 1 -> obj.name = x.next();
              case 2 -> obj.address = x.next();
              case 3 -> obj.departement = x.next();
              case 4 -> obj.job_title = x.next();
              case 5 -> obj.salary = x.nextDouble();
        
     
          }
          return obj;
          

    }

  
}