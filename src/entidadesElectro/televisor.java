package entidadesElectro;

import java.util.Scanner;

/**
 *
 * @author DAMY
 */
public class televisor extends electrodomestico {

    public int resolucion;
    public boolean TDT;

    public televisor() {
    }

    public televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public televisor(int resolucion, boolean TDT, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    public void creaTelevisor() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Ingrese las pulgadas :");
        setResolucion(leer.nextInt());
        System.out.println("Tiene sintonizador TDT S/N :");
        String resp = leer.next();
        resp = resp.toUpperCase();
        if (resp.equals("S")) {
            setTDT(true);
        }
    }

    public double precioFinalTelevisor() {
        double prefinal = precioFinal();
        if (isTDT() == true) {
            prefinal = prefinal + 500;
        }
        if (resolucion >= 40) {
            prefinal = prefinal + (prefinal * 30) / 100;
        }
        setPrecio(prefinal);
        System.out.println("El valor final del Televisor es: $" + getPrecio());
        return prefinal;
    }

    @Override
    public String toString() {
        return "televisor " + " precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + ", resolucion= " + resolucion + ", TDT=" + TDT + "\n" + '}';
    }

}
