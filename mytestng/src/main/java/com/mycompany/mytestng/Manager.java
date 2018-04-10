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
public class Manager extends Employee {
    @Override
    public void work() {
        System.out.println(this.name+" Works as a Manager");
}
    
    public static void main (String[] args) {
        Manager m=new Manager();
        m.id=2;
        m.name="Tom";
        m.work();
          Employee e=new Employee();
         e.id=1;
         e.name="Tejash";
         e.work();
         
         Employee e1=m;
         e1.work();
    }
    
    
}
