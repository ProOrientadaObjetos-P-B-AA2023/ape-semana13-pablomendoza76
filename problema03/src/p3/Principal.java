/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p3;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.MatriculaEscuela;
import p1.MatriculaJardin;
import p1.MatriculaMaternal;
import p2.TipoMatricula;
import p1.CalcularMatricula;
public class Principal {
    public static void main(String[] args) {
        TipoMatricula tipos = new TipoMatricula();

        MatriculaCampamento mcamp = new MatriculaCampamento();
        mcamp.establecerTarifa();

        MatriculaColegio mcolegio = new MatriculaColegio();
        mcolegio.establecerTarifa();

        tipos.establecerMatriculaCampamento((CalcularMatricula) mcamp);
        tipos.establecerMatriculaColegio((CalcularMatricula) mcolegio);
        tipos.establecerPromedioTarifas();

        System.out.printf("Promedio de tarifas: %.2f\n", tipos.obtenerPromedioTarifas());
    }
}
