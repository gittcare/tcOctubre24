package common;

public class Diskette extends MediosAlmacenamiento{

    double size;

    public Diskette(){

    }

    public Diskette(double capacidad, String magnitud, double size) {
        super(capacidad, magnitud);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Diskette{" +
                "size=" + size +
                '}';
    }
}
