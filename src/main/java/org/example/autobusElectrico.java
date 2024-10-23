package org.example;

public class autobusElectrico extends TransporteSostenible {
    private int capacidad;
    private double duracionCarga;

    public autobusElectrico() {
        this.capacidad = 790;
        this.duracionCarga = 20;
    }

    @Override
    public void detallesDeLaRuta() {
        System.out.println("Transporte: Autobús Eléctrico con: " + capacidad + " pasajeros. Duración de carga: " + duracionCarga + " horas.");
    }
}
