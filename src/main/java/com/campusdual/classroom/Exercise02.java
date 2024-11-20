package com.campusdual.classroom;

import static java.lang.Math.PI;

public class Exercise02 {

    public static void main(String[] args) {
        double r = 15;
        double a, l;

        // TODO: ↓ Fórmula del área de un círculoS: a = radio * radio * Número PI
            a= r*r*PI;
        System.out.println("Area: " + a);

        // TODO: ↓ Fórmula de la longitud de una circunferencia: l = 2 * radio * Número PI
        l=2*PI*r;
        System.out.println("Longitud:  " + l);

    }
}
