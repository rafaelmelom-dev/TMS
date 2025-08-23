/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ufu.tms.junittest.junittest;
import java.lang.IllegalArgumentException;

/**
 *
 * @author rafaelmelom
 */
public class Calculator {
    public double add (double a, double b) {
        return a + b;
    }
    
    public double sub (double a, double b) {
        return a - b;
    }
    
    public double div (double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }
        
        return a / b;
    }
    
    public double mult (double a, double b) {
        return a * b;
    }
    
    
}
