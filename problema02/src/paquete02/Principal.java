/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

import java.util.ArrayList;
import paquete01.Televisor;
import paquete03.VentasTvs;
import paquete03.MarcasVendidas;
public class Principal {

    public static void main(String[] args) {

        Televisor t1 = new Televisor("LG-14 pulgadas", 300.2);
        Televisor t2 = new Televisor("SAMSUMG-21 pulgadas", 1300.2);
        Televisor t3 = new Televisor("RIVIERA-29 pulgadas", 2300.5);
        ArrayList<Televisor> tvs = new ArrayList<>();
        tvs.add(t1);
        tvs.add(t2);
        tvs.add(t3);
        VentasTvs ventas = new VentasTvs();
        double precioTotal = ventas.calcularPrecioTotal(tvs);

        MarcasVendidas marcas = new MarcasVendidas();
        ArrayList<String> marcasVendidas = marcas.obtenerMarcasVendidas(tvs);
        System.out.printf("Precio total: %.2f\n", precioTotal);
        System.out.println("Marcas vendidas:");
        for (String marca : marcasVendidas) {
            System.out.println(marca);
        }
    }
}
