package com.tema9;

public class Trabajador extends Persona{

    private double salario;

    public Trabajador(int edad, String nombre, Long telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                    "salario=" + salario +
                "} "+
                "Persona{" +
                    "edad =" + super.getEdad() +
                    "nombre =" + super.getNombre() +
                    "telefono =" + super.getTelefono() +
                '}';
    }
}


