/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import java.util.ArrayList;
import paquete01.Televisor;
public class VentasTvs {

    public double calcularPrecioTotal(ArrayList<Televisor> televisores) {
        double total = 0;
        for (Televisor televisor : televisores) {
            total += televisor.obtenerPrecio();
        }
        return total;
    }
}