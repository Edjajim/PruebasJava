package com.mycompany.sobrecarga;

public class Burro {
    
    public void Opera(int i1, int i2, int i3, int i4){
        System.out.printf("\nLa suma de %d + %d + %d + %d es = %d", i1, i2, i3, i4, (i1 + i2 + i3 + i4));
        System.out.printf("\nLa resta de %d - %d - %d - %d es = %d", i1, i2, i3, i4, (i1 - i2 - i3 - i4));
        System.out.printf("\nLa multiplicación de %d * %d * %d * %d es = %d", i1, i2, i3, i4, (i1 * i2 * i3 * i4));
        System.out.printf("\nLa división de %d / %d / %d / %d es = %d", i1, i2, i3, i4, (i1 / i2 / i3 / i4));
    }
    
    public void Opera(float i1, float i2, float i3, float i4){
        System.out.printf("\nLa suma de %f + %f + %f + %f es = %f", i1, i2, i3, i4, (i1 + i2 + i3 + i4));
        System.out.printf("\nLa resta de %f - %f - %f - %f es = %f", i1, i2, i3, i4, (i1 - i2 - i3 - i4));
        System.out.printf("\nLa multiplicación de %f * %f * %f * %f es = %f", i1, i2, i3, i4, (i1 * i2 * i3 * i4));
        System.out.printf("\nLa división de %f / %f / %f / %f es = %f", i1, i2, i3, i4, (i1 / i2 / i3 / i4));
    }
    
    public void Opera(double i1, double i2, double i3, double i4){
        System.out.printf("\nLa suma de %f + %f + %f + %f es = " + (i1 + i2 + i3 + i4), i1, i2, i3, i4);
        System.out.printf("\nLa resta de %f - %f - %f - %f es = " + (i1 - i2 - i3 - i4), i1, i2, i3, i4);
        System.out.printf("\nLa multiplicación de %f * %f * %f * %f es = " + (i1 * i2 * i3 * i4), i1, i2, i3, i4);
        System.out.printf("\nLa división de %f / %f / %f / %f es = " + (i1 / i2 / i3 / i4), i1, i2, i3, i4);
    }
    
    public void Opera(String i1, String i2, String i3, String i4){
        System.out.printf("\nLa suma de %s + %s + %s + %s es = %1$s %2$s %3$s %4$s", i1, i2, i3, i4);
        System.out.println("\nNo pueden restarse cadenas de texto");
        System.out.println("No pueden multiplicarse cadenas de texto");
        System.out.println("No pueden dividirse cadenas de texto");
    }
    
    public void Opera(int i1, float i2, double i3, String i4){
        System.out.printf("\nLa suma de %d + %f + %f + %s es = %f %4$s", i1, i2, i3, i4, (i1 + i2 + i3));
        System.out.printf("\nLa resta de %d - %f - %f - %s es = %f %4$s", i1, i2, i3, i4, (i1 - i2 - i3));
        System.out.printf("\nLa multiplicación de %d * %f * %f * %s es = %f %4$s", i1, i2, i3, i4, (i1 * i2 * i3));
        System.out.printf("\nLa división de %d / %f / %f / %s es = %f %4$s", i1, i2, i3, i4, (i1 / i2 / i3));
    }
}
