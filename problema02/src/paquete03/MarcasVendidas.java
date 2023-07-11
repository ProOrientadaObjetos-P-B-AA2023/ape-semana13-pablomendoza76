/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

/**
 *
 * @author Usuario iTC
 */
import java.util.ArrayList;
import paquete01.Televisor;

public class MarcasVendidas {

    public ArrayList<String> obtenerMarcasVendidas(ArrayList<Televisor> televisores) {
        ArrayList<String> marcasVendidas = new ArrayList<>();
        for (Televisor televisor : televisores) {
            String marca = televisor.obtenerMarca();
            if (!marcasVendidas.contains(marca)) {
                marcasVendidas.add(marca);
            }
        }
        return marcasVendidas;
    }
}



