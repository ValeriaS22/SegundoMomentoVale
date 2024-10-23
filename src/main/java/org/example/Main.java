package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione el transporte (1 = Bicicleta, 2 = Autobús Eléctrico):");
        TransporteSostenible transporte;
        int opcion = scanner.nextInt();
        if (opcion == 1) {
            transporte = new bicicleta();
        } else {
            transporte = new autobusElectrico();
        }

        System.out.print("Ingrese la distancia (km): ");
        double distancia = scanner.nextDouble();
        System.out.print("Ingrese el tiempo estimado (horas): ");
        double tiempo = scanner.nextDouble();

        transporte.estimacion(distancia, tiempo);
        transporte.detallesDeLaRuta();

        scanner.close();
    }
}