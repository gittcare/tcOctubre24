package common;

public class MemoriaUSB extends MediosAlmacenamiento{

    String protocolo;

    public MemoriaUSB(){

    }

    public MemoriaUSB(double capacidad, String magnitud, String protocolo) {
        super(capacidad, magnitud);
        this.protocolo = protocolo;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo(String protocolo) {
        this.protocolo = protocolo;
    }

    @Override
    public String toString() {
        return "MemoriaUSB{" +
                "protocolo='" + protocolo + '\'' +
                '}';
    }
}
