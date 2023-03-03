package com.mycompany.examenu2;

public class Hijo {

    public void Identifica(String[][] completo, int[] enteros, double[] decimales, String[] cadenas, int i) {
        int j, d, f, s;
        j = d = f = s = 0;
        while (j < i - 1) {
            if (completo[j][0].equals("1")) {
                enteros[d] = Integer.parseInt(completo[j][1]);
                d++;
            }
            if (completo[j][0].equals("2")) {
                decimales[f] = Double.parseDouble(completo[j][1]);
                f++;
            }
            if (completo[j][0].equals("3")) {
                cadenas[s] = completo[j][1];
                s++;
            }
            j++;
        }
    }

    public void Tipo(String[][] completo, int i) {
        for (int j = 0; j < i - 1; j++) {
            if (completo[j][0].equals("1")) {
                System.out.println(completo[j][1] + " es tipo entero");
            }
            if (completo[j][0].equals("2")) {
                System.out.println(completo[j][1] + " es tipo decimal");
            }
            if (completo[j][0].equals("3")) {
                System.out.println(completo[j][1] + " es tipo cadena de caracteres");
            }
        }
    }

    public void Suma(int[] enteros) {
        int divi, suma = 0;
        for (int j = 0; j < enteros.length; j++) {
            divi = 0;
            for (int i = 1; i <= enteros[j]; i++) {
                if (enteros[j] % i == 0) {
                    divi++;
                }
            }
            if (divi == 2) {
                suma = suma + enteros[j];
            }
        }
        System.out.println("La suma de los enteros primos es " + suma);
    }
    
    public void Fibonacci(double[] decimal){
        double aux;
        
        for (int i = 0; i <= decimal.length-1; i++) {
            for (int j = 0; j <= decimal.length-1; j++) {
                if (decimal[i] < decimal[j]) {
                    aux = decimal[i];
                    decimal[i] = decimal[j];
                    decimal[j] = aux;
                }
            }
        }
        double mayor = decimal[decimal.length-1];
        System.out.println(mayor);
        int suma, x, y;
        suma = x = 0;
        y = 1;
        for (int i = 0; suma <= mayor; i++) {
            System.out.println(suma);
            suma = x + y;
            x = y;
            y = suma;
        }
    }
    
    public void Concatena(String[] cadena){
        System.out.println("");
        for (String cadena1 : cadena) {
            System.out.print(cadena1 + " ");
        }
    }
}
