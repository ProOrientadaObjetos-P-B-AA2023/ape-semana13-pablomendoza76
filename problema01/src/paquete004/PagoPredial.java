/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

public class PagoPredial extends Pago {
    private double valorPropiedad;
    private double porcentajeDescuento;

    public PagoPredial(double valorPropiedad, double porcentajeDescuento) {
        super(0); // No se utiliza el costo en el constructor de PagoPredial
        this.valorPropiedad = valorPropiedad;
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public double calcularPago() {
        return valorPropiedad - ((valorPropiedad * porcentajeDescuento) / 100);
    }
}
