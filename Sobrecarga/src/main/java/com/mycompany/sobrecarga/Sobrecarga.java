package com.mycompany.sobrecarga;

import java.util.Scanner;

public class Sobrecarga {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String arreglo[] = new String[4];
        int enteros[] = new int[4];
        boolean entero, doble, flotante, cadena;
        int i1, i2, i3, i4;
        double d1, d2, d3, d4;
        float f1, f2, f3, f4;
        String s1, s2, s3, s4;
        Burro obj = new Burro();

        entero = doble = flotante = cadena = false;
        i1 = i2 = i3 = i4 = 0;
        d1 = d2 = d3 = d4 = f1 = f2 = f3 = f4 = 0;
        s1 = s2 = s3 = s4 = "";

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresa el dato " + i);
            arreglo[i] = leer.next();
        }

        for (int i = 0; i < 4; i++) {
            try {
                i1 = Integer.parseInt(arreglo[0]);
                i2 = Integer.parseInt(arreglo[1]);
                i3 = Integer.parseInt(arreglo[2]);
                i4 = Integer.parseInt(arreglo[3]);
                entero = true;
            } catch (NumberFormatException e) {
                try {
                    f1 = Float.parseFloat(arreglo[0]);
                    f2 = Float.parseFloat(arreglo[1]);
                    f3 = Float.parseFloat(arreglo[2]);
                    f4 = Float.parseFloat(arreglo[3]);
                    flotante = true;
                } catch (NumberFormatException f) {
                    try {
                        d1 = Double.parseDouble(arreglo[0]);
                        d2 = Double.parseDouble(arreglo[1]);
                        d3 = Double.parseDouble(arreglo[2]);
                        d4 = Double.parseDouble(arreglo[3]);
                        doble = true;
                    } catch (NumberFormatException g) {
                        try {
                            i1 = Integer.parseInt(arreglo[0]);
                            f2 = Float.parseFloat(arreglo[1]);
                            d3 = Double.parseDouble(arreglo[2]);
                            s4 = (arreglo[3]);
                        } catch (NumberFormatException h) {
                            s1 = (arreglo[0]);
                            s2 = (arreglo[1]);
                            s3 = (arreglo[2]);
                            s4 = (arreglo[3]);
                            cadena = true;
                        }
                    }
                }
            }
        }

        if (entero) {
            obj.Opera(i1, i2, i3, i4);
        } else if (flotante) {
            obj.Opera(f1, f2, f3, f4);
        } else if (doble) {
            obj.Opera(d1, d2, d3, d4);
        } else if (cadena) {
            obj.Opera(s1, s2, s3, s4);
        } else {
            try {
                obj.Opera(i1, f2, d3, s4);
            } catch (NumberFormatException e) {
            }
        }
    }
}
