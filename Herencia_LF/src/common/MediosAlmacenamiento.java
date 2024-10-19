package common;

public class MediosAlmacenamiento {

    double nb;

    public MediosAlmacenamiento() {

    }

    public MediosAlmacenamiento(double nb) {
        this.nb = nb;
    }

    public double getNb() {
        return nb;
    }

    public void setNb(double nb) {
        this.nb = nb;
    }

    @Override
    public String toString() {
        return "MediosAlmacenamiento{" +
                "nb=" + nb +
                '}';
    }
}
