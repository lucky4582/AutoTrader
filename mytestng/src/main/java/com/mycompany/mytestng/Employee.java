/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mytestng;

/**
 *
 * @author shashi
 */
public class Employee {
    int id;
    String name;
    int age;
    double salary;
    public void work() {
        System.out.println(this.name+" Works");
}
     public static void main (String[] args) {
         Employee e=new Employee();
         e.id=1;
         e.name="Tejash";
         e.work();
                 
         
         
     }
}