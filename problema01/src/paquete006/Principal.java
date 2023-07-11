/**
 *
 * @author reroes
 */
package paquete006;

import paquete003.BilleteraPagos;
import paquete001.Persona;
import paquete004.*;
/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona = new Persona();
        persona.setNombre("Iam");
        persona.setApellido("Estrella");

        // Crear una instancia de BilleteraPagos
        BilleteraPagos billetera = new BilleteraPagos(persona);

        // Obtener los datos de agua para comerciales
        double[][] datosAguaComerciales = DatosAgua.datosComerciales();
        for (double[] dato : datosAguaComerciales) {
            PagoAguaPotable pagoAguaComercial = new PagoAguaPotable(dato[0], dato[1], dato[2]);
            billetera.agregarPago(pagoAguaComercial);
        }

        // Obtener los datos de agua para casas
        double[][] datosAguaCasas = DatosAgua.datosCasas();
        for (double[] dato : datosAguaCasas) {
            PagoAguaPotable pagoAguaCasa = new PagoAguaPotable(dato[0], dato[1], dato[2]);
            billetera.agregarPago(pagoAguaCasa);
        }

        // Obtener los datos de luz para la ciudad de Loja
        double[][] datosLuzLoja = DatosLuz.datosLoja();
        for (double[] dato : datosLuzLoja) {
            PagoLuzElectrica pagoLuzLoja = new PagoLuzElectrica(dato[0], dato[1], dato[2], "Loja");
            billetera.agregarPago(pagoLuzLoja);
        }

        // Obtener los datos de luz para otras ciudades
        double[][] datosLuzGeneral = DatosLuz.datosGeneral();
        for (double[] dato : datosLuzGeneral) {
            PagoLuzElectrica pagoLuzGeneral = new PagoLuzElectrica(dato[0], dato[1], dato[2], "General");
            billetera.agregarPago(pagoLuzGeneral);
        }

        // Obtener los datos de propiedades
        double[][] datosPropiedades = DatosPropiedades.datos();
        for (double[] dato : datosPropiedades) {
            double valorPropiedad = dato[0];
            double porcentajeDescuento = dato[1];
            PagoPredial pagoPredial = new PagoPredial(valorPropiedad, porcentajeDescuento);
            billetera.agregarPago(pagoPredial);
        }

        // Obtener los datos de teléfono
        double[][] datosTelefono = DatosTelefono.datos();
        for (double[] dato : datosTelefono) {
            PagoTelefonoConvencional pagoTelefono = new PagoTelefonoConvencional(dato[0], dato[1]);
            billetera.agregarPago(pagoTelefono);
        }
        // Generar y mostrar el informe general
        String informe = billetera.generarReporte();
        System.out.println(informe);
    }
}



