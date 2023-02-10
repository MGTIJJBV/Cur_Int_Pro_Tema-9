package com.tema9;

public class Main {
    public static void main(String[] args) {

        Cliente cliente =new Cliente(38, "Jorge", 8115001876L, 55000.00);
        System.out.println("Valores de cliente = " + cliente.toString());

        Trabajador trabajador = new Trabajador(38, "Jesus", 8180287602L, 30000.00);
        System.out.println("Valores de cliente = " + trabajador.toString());
    }
}