/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

/**
 *
 * @author Usuario iTC
 */
public abstract class Pago {
    private double costo;
    public Pago(double costo) {
        this.costo = costo;
    }
    public abstract double calcularPago();
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
}

