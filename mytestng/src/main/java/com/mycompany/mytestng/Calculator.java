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
public class Calculator {
    

    public int add(int n1, int n2) {
    return n1+n2;
            }
    public double add(int n1, int n2 int n3){
     return n1+n2+n3
     
             }
     public double add(int n1, int n2, int n3){
        return n1+n2+n3;
             }
public static void main(String[] args) {
Calculator c=new Calculator();
System.out.println(c.add(10,5));
//System.out.println(c.add(10.5,5.6));
System.out.println(c.add(10,5,20));
}
//
//    private boolean add(double d, double d0) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
