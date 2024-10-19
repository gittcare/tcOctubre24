package common;

public class Celular {

    String modelo;
    String marca;
    double bateria;

    public  Celular(){

    }

    public Celular(String modelo, String marca, double bateria) {
        this.modelo = modelo;
        this.marca = marca;
        this.bateria = bateria;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getBateria() {
        return bateria;
    }

    public void setBateria(double bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", bateria=" + bateria +
                '}';
    }
}
