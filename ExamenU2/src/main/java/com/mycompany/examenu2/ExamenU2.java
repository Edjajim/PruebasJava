package com.mycompany.examenu2;

import java.util.Scanner;

public class ExamenU2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Hijo obj = new Hijo();
        int i, j, cont_ent, cont_dec, cont_cad;
        String arregloc[][] = new String[1000][2];
        i = cont_ent = cont_dec = cont_cad = 0;
        int ent;
        double dec;
        String dato;

        do {
            j = 0;
            System.out.println("Ingrese un dato: ");
            dato = leer.next();
            try {
                ent = Integer.parseInt(dato);
                cont_ent++;
                arregloc[i][j] = "1";
                j++;
                arregloc[i][j] = dato;
            } catch (NumberFormatException e) {
                try {
                    dec = Double.parseDouble(dato);
                    cont_dec++;
                    arregloc[i][j] = "2";
                    j++;
                    arregloc[i][j] = dato;
                } catch (NumberFormatException f) {
                    cont_cad++;
                    arregloc[i][j] = "3";
                    j++;
                    arregloc[i][j] = dato;
                }
            }
            i++;
        } while (!dato.equals("0"));

        String arreglo[] = new String[cont_cad];
        int enteros[] = new int[cont_ent];
        double decimales[] = new double[cont_dec];

        obj.Identifica(arregloc, enteros, decimales, arreglo, i);
        obj.Tipo(arregloc, i);
        obj.Suma(enteros);
        obj.Fibonacci(decimales);
        obj.Concatena(arreglo);
    }
}
