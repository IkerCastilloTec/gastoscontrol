package com.iker.gastoscontrol.util;

import java.util.Scanner;

public class ConsolaUtil {

    private static Scanner scanner = new Scanner(System.in);

    public static int leerEntero() {
        return scanner.nextInt();
    }

    public static double leerDouble() {
        return scanner.nextDouble();
    }

    public static String leerTexto() {
        scanner.nextLine(); // limpiar buffer
        return scanner.nextLine();
    }
}