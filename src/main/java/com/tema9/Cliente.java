package com.tema9;

public class Cliente extends Persona{

    private double credito;

    public Cliente(int edad, String nombre, Long telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
    public void setCredito(double credito) {
        this.credito = credito;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                    " credito =" + credito +
                "} "+
                "Persona{" +
                    " edad =" + super.getEdad() +
                    " nombre =" + super.getNombre() +
                    " telefono =" + super.getTelefono() +
                '}';
    }
}
