package com.mycompany.sinconstructor;

public class SinConstructor {

    public static void main(String[] args) {
        SinConstructor des = new SinConstructor();
        des.finalize();
        des = null;
        System.gc();
        System.out.print("main() method ");

    }

    protected void finalize() {
        System.out.print("Destroyed ");
    }
}
