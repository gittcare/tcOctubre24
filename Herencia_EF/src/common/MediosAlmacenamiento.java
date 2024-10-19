package common;

public class MediosAlmacenamiento {

    double capacidad;
    String magnitud;

    public MediosAlmacenamiento(){

    }

    public MediosAlmacenamiento(double capacidad, String magnitud) {
        this.capacidad = capacidad;
        this.magnitud = magnitud;
    }

    public double getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(double capacidad) {
        this.capacidad = capacidad;
    }

    public String getMagnitud() {
        return magnitud;
    }

    public void setMagnitud(String magnitud) {
        this.magnitud = magnitud;
    }

    @Override
    public String toString() {
        return "MediosAlmacenamiento{" +
                "capacidad=" + capacidad +
                ", magnitud='" + magnitud + '\'' +
                '}';
    }
}
