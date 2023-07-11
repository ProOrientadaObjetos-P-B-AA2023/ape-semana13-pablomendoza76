/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete004;

import paquete001.Persona;

/**
 *
 * @author reroes
 */
public class PagoAguaPotable extends Pago {
    private double metrosCubicosConsumo;
    private double costoConsumoCubicos;

    public PagoAguaPotable(double costo, double metrosCubicosConsumo, double costoConsumoCubicos) {
        super(costo);
        this.metrosCubicosConsumo = metrosCubicosConsumo;
        this.costoConsumoCubicos = costoConsumoCubicos;
    }

    @Override
    public double calcularPago() {
        return getCosto() + (metrosCubicosConsumo * costoConsumoCubicos);
    }
}

