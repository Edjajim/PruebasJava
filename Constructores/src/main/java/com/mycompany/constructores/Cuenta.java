package com.mycompany.constructores;

public class Cuenta {
    String nombre;
    String tipo;
    int id = 0;
    double saldo;

    public Cuenta(String nombre, String tipo, double saldo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.saldo = saldo;
        id = SetID();
    }
    
    public int SetID(){
        int id;
        
        id = (int)(Math.random()*10000000);
        
        return id;
    }
    
    public void Esta(){
        System.out.println(this);
    }
    
    public void ShowData(){
        System.out.println(nombre);
        System.out.println(tipo);
        System.out.println(id);
        System.out.printf("$%.2f", saldo);
    }
    
    @Override
    public void finalize() throws Throwable{
        try {
            System.out.printf("\nCuenta %d eliminada", id);
        } finally {
            super.finalize();
        }
    }
}
