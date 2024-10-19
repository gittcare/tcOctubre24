package common;

public class Camara {

    String resolucion;
    int valorISO;
    double distFocal;
    double tamSensor;

    public Camara(){

    }

    public Camara(String resolucion, int valorISO, double distFocal, double tamSensor) {
        this.resolucion = resolucion;
        this.valorISO = valorISO;
        this.distFocal = distFocal;
        this.tamSensor = tamSensor;
    }

    public String getResolucion() {
        return resolucion;
    }

    public void setResolucion(String resolucion) {
        this.resolucion = resolucion;
    }

    public int getValorISO() {
        return valorISO;
    }

    public void setValorISO(int valorISO) {
        this.valorISO = valorISO;
    }

    public double getDistFocal() {
        return distFocal;
    }

    public void setDistFocal(double distFocal) {
        this.distFocal = distFocal;
    }

    public double getTamSensor() {
        return tamSensor;
    }

    public void setTamSensor(double tamSensor) {
        this.tamSensor = tamSensor;
    }

    @Override
    public String toString() {
        return "Camara{" +
                "resolucion='" + resolucion + '\'' +
                ", valorISO=" + valorISO +
                ", distFocal=" + distFocal +
                ", tamSensor=" + tamSensor +
                '}';
    }
}
