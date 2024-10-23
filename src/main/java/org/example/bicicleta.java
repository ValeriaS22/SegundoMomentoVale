package org.example;

public class bicicleta extends TransporteSostenible {
    private double velocidadPromedio;
    private int paradasPosibles;

    public bicicleta() {
        this.velocidadPromedio = 157;
        this.paradasPosibles = 34;
    }

    @Override
    public void detallesDeLaRuta() {
        System.out.println("Transporte: Bicicleta con: " + velocidadPromedio + " velocidad promedio. Con paradas posbiles: " + paradasPosibles);
    }
}
