package entidadesElectro;

import java.util.Scanner;

/**
 *
 * @author DAMY
 */
public class lavadora extends electrodomestico {

    private int carga;

    public lavadora() {
    }

    public lavadora(int carga) {
        this.carga = carga;
    }

    public lavadora(int carga, double precio, String color, String consumoEnergetico, double peso) {
        super(precio, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public void creaLavadora() {
        Scanner leer = new Scanner(System.in);
        crearElectrodomestico();
        System.out.println("Ingrese los Kg de carga:");
        setCarga(leer.nextInt());

    }

    public double precioFinalLavadora() {
        double prefinal = precioFinal();
        if (getCarga() > 30) {
            prefinal = getPrecio() + 500;
        } else {
            prefinal = getPrecio();
        }
        setPrecio(prefinal);
        System.out.println("El valor final de la Lavadora es: $" + getPrecio());
        return prefinal;
    }

    @Override
    public String toString() {
        return "**Informacion adicional de Lavadora: " + "precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + ", carga= " + carga + "\n" + '}';
    }

}
