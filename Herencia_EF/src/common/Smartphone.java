package common;

import java.util.Arrays;

public class Smartphone extends Celular {

    String sistemaOperativo;
    Camara cam;
    String [] aplicaciones;
    double alamagenamiento;
    String[] conectividad;

    public Smartphone(){

    }

    public Smartphone(String modelo, String marca, double bateria, String sistemaOperativo, Camara cam, String[] aplicaciones, double alamagenamiento, String[] conectividad) {
        super(modelo, marca, bateria);
        this.sistemaOperativo = sistemaOperativo;
        this.cam = cam;
        this.aplicaciones = aplicaciones;
        this.alamagenamiento = alamagenamiento;
        this.conectividad = conectividad;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Camara getCam() {
        return cam;
    }

    public void setCam(Camara cam) {
        this.cam = cam;
    }

    public String[] getAplicaciones() {
        return aplicaciones;
    }

    public void setAplicaciones(String[] aplicaciones) {
        this.aplicaciones = aplicaciones;
    }

    public double getAlamagenamiento() {
        return alamagenamiento;
    }

    public void setAlamagenamiento(double alamagenamiento) {
        this.alamagenamiento = alamagenamiento;
    }

    public String[] getConectividad() {
        return conectividad;
    }

    public void setConectividad(String[] conectividad) {
        this.conectividad = conectividad;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "sistemaOperativo='" + sistemaOperativo + '\'' +
                ", cam=" + cam +
                ", aplicaciones=" + Arrays.toString(aplicaciones) +
                ", alamagenamiento=" + alamagenamiento +
                ", conectividad=" + Arrays.toString(conectividad) +
                '}';
    }
}
