package com.zakariaahnaf.basicjava_cse;

public class DoubleValuePrint {
    static public void DoubleCall(double doubleNuber){
        //2 digits after decimal point
        System.out.printf("%.2f", doubleNuber);
        System.out.println("");

        //right justified
        System.out.printf("%.2s", doubleNuber);
        System.out.println("");

        //left justified
        System.out.printf("%-1.2f", doubleNuber);
        System.out.println("");

        //0-padded format,
        int a = 15;
        String with3digits = String.format("%03d", a);
        System.out.println(with3digits);
    }



}
