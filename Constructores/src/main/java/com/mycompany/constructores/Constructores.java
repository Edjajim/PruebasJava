package com.mycompany.constructores;
import java.util.Scanner;

public class Constructores {

    public static void main(String[] args) throws Throwable {
        Scanner leer = new Scanner(System.in);
        String nombre, tipo;
        double saldo;
        
        Cuenta cuenta1 = new Cuenta("Eduardo", "Ahorro", 200);
        
        System.out.println("Ingrese su Nombre:");
        nombre = leer.next();
        System.out.println("Ingrese el tipo de cuenta que solicita:");
        tipo = leer.next();
        System.out.println("Ingrese el saldo con el que se generará la cuenta:");
        saldo = leer.nextDouble();
        
        Cuenta cuenta2 = new Cuenta(nombre, tipo, saldo);
        
//        Demostración de que la palabra reservada this es una referencia
//        cuenta1.Esta();
//        System.out.println(cuenta1);
//        cuenta2.Esta();
        System.out.println(cuenta2);

        cuenta1.ShowData();
        System.out.println("");
        cuenta2.ShowData();
        
        cuenta2.finalize();
        System.gc();
        
        System.out.println(cuenta2);
    }
}
