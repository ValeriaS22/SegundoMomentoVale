package org.example;

public abstract class TransporteSostenible {
    private String tipoTransporte;

    public void setTipoTransporte(String tipoTransporte) {
        this.tipoTransporte = tipoTransporte;
    }

    public String getTipoTransporte() {
        return tipoTransporte;
    }

    public void estimacion(double distancia, double tiempo) {
        double velocidad = tiempo > 0 ? distancia / tiempo : 0;
        System.out.println("Ruta de " + distancia + " km en " + tiempo + " horas. Velocidad: " + velocidad + " km/h.");
    }

    public void estimacion(String tipoTransporte) {
        System.out.println("Ruta utilizando: " + tipoTransporte);
    }

    public void estimacion(double distancia, String inicio, String fin) {
        System.out.println("Ruta desde " + inicio + " hasta " + fin + " con una distancia de " + distancia + " km.");
    }

    public abstract void detallesDeLaRuta();
}
