/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

public class MatriculaCampamento implements CalcularMatricula {
    private double tarifa;

    public void establecerTarifa() {
        // tarifa = costo transporte + costo comida + costo instructores
        tarifa = 100.2 + 30.2 + 90.2;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}
