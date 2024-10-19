import common.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        MediosAlmacenamiento ma = new MediosAlmacenamiento();
        ma.setCapacidad(3.4);
        ma.setMagnitud("Gb");

        System.out.println(ma);

        MemoriaUSB usb = new MemoriaUSB();
        usb.setCapacidad(128);
        usb.setMagnitud("Gb");
        usb.setProtocolo("3.0"); // Componente exclusivo de la hija


        Diskette d1 = new Diskette();
        d1.setCapacidad(12);
        d1.setMagnitud("Mb");
        d1.setSize(5.5);

        Celular c1 = new Celular();

        Camara cam = new Camara("4k",2800,2.4,2.1);

        // Inicializar un array con valores desde el inicio
        String[] apps = {"facebook","whatsapp","telegram","maps","reddit"};
        String[] con = {"2G","3G","4G","5G","Wifi","Bluetooh","NFC"};

        Smartphone s1 = new Smartphone("S23 Ultra","Samsung",5000,"Android 14"
                , cam,apps,128.5,con);
        System.out.println(s1);
    }
}