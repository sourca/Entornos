/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.figuras;

/**
 *
 * @author Sonia
 */
public class rectangulo {
    private double lado1;
    private double lado2;
    
    public rectangulo(double l1, double l2){
        lado1=l1;
        lado2=l2;
    }
    
    public double obtenerArea(){
        return lado1*lado2;
    }
    
}
