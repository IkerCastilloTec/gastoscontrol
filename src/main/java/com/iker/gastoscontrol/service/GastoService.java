package com.iker.gastoscontrol.service;

import com.iker.gastoscontrol.model.Gasto;
import java.util.ArrayList;
import java.util.List;

public class GastoService {

    private List<Gasto> listaGastos;

    public GastoService() {
        listaGastos = new ArrayList<>();
    }

    public void agregarGasto(Gasto gasto) {
        listaGastos.add(gasto);
    }

    public void mostrarGastos() {
        if (listaGastos.isEmpty()) {
            System.out.println("No hay gastos registrados.");
            return;
        }

        System.out.println("\n--- Lista de gastos ---");
        for (Gasto g : listaGastos) {
            System.out.println(g);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for (Gasto g : listaGastos) {
            total += g.getMonto();
        }
        return total;
    }
}