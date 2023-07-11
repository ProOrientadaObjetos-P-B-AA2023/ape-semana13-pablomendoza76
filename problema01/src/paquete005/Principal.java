/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete005;
import paquete001.Persona;
import paquete002.Ciudad;
import paquete003.BilleteraPagos;
import paquete004.PagoAguaPotable;
import paquete004.PagoLuzElectrica;
import paquete004.PagoPredial;
import paquete004.PagoTelefonoConvencional;
/**
 *
 * @author reroes
 */

public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Ciudad ciudad = new Ciudad("Loja");
        Ciudad loja = null;
        Persona persona = new Persona("Pablo", "Mendoza", 20, "1105662157", loja);

        // Crear una instancia de BilleteraPagos
        BilleteraPagos billetera = new BilleteraPagos(persona);

        // Agregar pagos a la billetera
        PagoAguaPotable aguaCasa = new PagoAguaPotable(2.20, 100.2, 0.2);
        PagoAguaPotable aguaComercio = new PagoAguaPotable(2.30, 50.2, 0.4);
        PagoLuzElectrica luzCasa = new PagoLuzElectrica(12.0, 100.2, 0.2, ciudad.getNombreCiudad());
        PagoLuzElectrica luzComercio = new PagoLuzElectrica(12.1, 50.2, 0.4, ciudad.getNombreCiudad());
        PagoPredial casa1 = new PagoPredial(120000, 10);
        PagoPredial casa2 = new PagoPredial(40000, 20);        PagoTelefonoConvencional telefonoCasa = new PagoTelefonoConvencional(200.2, 0.2);
        PagoTelefonoConvencional telefonoFinca = new PagoTelefonoConvencional(250.2, 0.4);

        billetera.agregarPago(aguaCasa);
        billetera.agregarPago(aguaComercio);
        billetera.agregarPago(luzCasa);
        billetera.agregarPago(luzComercio);
        billetera.agregarPago(casa1);
        billetera.agregarPago(casa2);
        billetera.agregarPago(telefonoCasa);
        billetera.agregarPago(telefonoFinca);

        // Generar y mostrar el informe general
        String informe = billetera.generarReporte();
        System.out.println(informe);
    }
}

