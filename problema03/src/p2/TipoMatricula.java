/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.MatriculaCampamento;
import p1.MatriculaColegio;
import p1.CalcularMatricula;
public class TipoMatricula {
    private double promedioMatriculas;
    private CalcularMatricula campamento;
    private CalcularMatricula colegio;

    public void establecerMatriculaCampamento(CalcularMatricula c) {
        campamento = c;
    }

    public void establecerMatriculaColegio(CalcularMatricula c) {
        colegio = c;
    }

    public CalcularMatricula obtenerMatriculaCampamento() {
        return campamento;
    }

    public CalcularMatricula obtenerMatriculaColegio() {
        return colegio;
    }

    public void establecerPromedioTarifas() {
        promedioMatriculas = (obtenerMatriculaCampamento().calcularTarifaMatricula()
                + obtenerMatriculaColegio().calcularTarifaMatricula()) / 2;
    }

    public double obtenerPromedioTarifas() {
        return promedioMatriculas;
    }
}

