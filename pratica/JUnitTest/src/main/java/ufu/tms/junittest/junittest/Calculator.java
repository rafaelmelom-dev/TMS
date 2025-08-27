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
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double div(double a, double b) throws IllegalArgumentException {
        if (b == 0) {
            throw new IllegalArgumentException();
        }

        return a / b;
    }

    public double mult(double a, double b) {
        return a * b;
    }

    public double raizQ(double a) throws IllegalArgumentException {
        if (a < 0) {
            throw new IllegalArgumentException();
        }

        return Math.sqrt(a);
    }

    public double pontenc(double a, int b) {
        double total = 1;

        for (int i = 0; i < b; i++) {
            total *= a;
        }

        return total;
    }

}
