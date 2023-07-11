/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete003;

import paquete001.Persona;
import paquete004.Pago;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;

/**
 *
 * @author reroes
 */

import java.util.ArrayList;
import java.util.List;

public class BilleteraPagos {
    private Persona persona;
    private List<Pago> pagos;

    public BilleteraPagos(Persona persona) {
        this.persona = persona;
        this.pagos = new ArrayList<>();
    }

    public BilleteraPagos(Persona persona, List<Pago> pagos) {
        this.persona = persona;
        this.pagos = pagos;
    }
    public void agregarPago(Pago pago) {
        pagos.add(pago);
    }

    public double calcularGastoTotal() {
        double gastoTotal = 0;
        for (Pago pago : pagos) {
            gastoTotal += pago.calcularPago();
        }
        return gastoTotal;
    }

    public String generarReporte() {
        StringBuilder reporte = new StringBuilder();
        reporte.append("Reporte de la Billetera de Pagos:\n");
        reporte.append("Persona: ").append(persona.getNombre()).append(" ").append(persona.getApellido()).append("\n");
        reporte.append("Gasto total: $").append(calcularGastoTotal()).append("\n");
        reporte.append("Pagos realizados:\n");
        for (Pago pago : pagos) {
            reporte.append("- ").append(pago.getClass().getSimpleName()).append(": $").append(pago.calcularPago()).append("\n");
        }
        return reporte.toString();
    }
}

