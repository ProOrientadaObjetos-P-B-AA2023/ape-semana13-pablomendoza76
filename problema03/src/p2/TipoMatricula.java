/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p2;

import p1.CalculadoraMatricula;
import p1.MatriculaCampamento;
import p1.MatriculaColegio;
public class TipoMatricula {
    private double promedioMatriculas;
    private CalculadoraMatricula campamento;
    private CalculadoraMatricula colegio;

    public void establecerMatriculaCampamento(CalculadoraMatricula c) {
        campamento = c;
    }

    public void establecerMatriculaColegio(CalculadoraMatricula c) {
        colegio = c;
    }

    public CalculadoraMatricula obtenerMatriculaCampamento() {
        return campamento;
    }

    public CalculadoraMatricula obtenerMatriculaColegio() {
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

