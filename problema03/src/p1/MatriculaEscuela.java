/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p1;

public class MatriculaEscuela implements CalculadoraMatricula {
    private double tarifa;

    public void establecerTarifa() {
        // tarifa = costo libros + costo deportes + costo folletos + costo uniformes
        tarifa = 50.2 + 40.2 + 140.2 + 200.4;
    }

    public double obtenerTarifa() {
        return tarifa;
    }

    @Override
    public double calcularTarifaMatricula() {
        return obtenerTarifa();
    }
}

