package com.iker.gastoscontrol;

import com.iker.gastoscontrol.model.Gasto;
import com.iker.gastoscontrol.service.GastoService;
import com.iker.gastoscontrol.util.ConsolaUtil;

public class Main {

    public static void main(String[] args) {

        GastoService servicio = new GastoService();
        int opcion;

        do {
            System.out.println("\n=== SISTEMA GASTOS CONTROL (AVANCE) ===");
            System.out.println("1. Agregar gasto");
            System.out.println("2. Mostrar gastos");
            System.out.println("3. Mostrar total");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = ConsolaUtil.leerEntero();

            switch (opcion) {
                case 1:
                    System.out.print("Descripción: ");
                    String descripcion = ConsolaUtil.leerTexto();

                    System.out.print("Monto: ");
                    double monto = ConsolaUtil.leerDouble();

                    Gasto gasto = new Gasto(descripcion, monto);
                    servicio.agregarGasto(gasto);
                    System.out.println("Gasto registrado.");
                    break;

                case 2:
                    servicio.mostrarGastos();
                    break;

                case 3:
                    System.out.println("Total gastado: $" + servicio.calcularTotal());
                    break;

                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);


    }
}