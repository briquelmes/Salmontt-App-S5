package model;

public class CentroCultivo {
    private String nombre;
    private String comuna;
    private double toneladas;

    public CentroCultivo(String nombre, String comuna, double toneladas) {
        this.nombre = nombre;
        this.comuna = comuna;
        this.toneladas = toneladas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public double getToneladas() {
        return toneladas;
    }

    public void setToneladas(double toneladas) {
        this.toneladas = toneladas;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " - Comuna: " + comuna + " - Toneladas: " + toneladas;
    }
}
