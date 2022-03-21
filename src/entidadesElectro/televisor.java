
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
        System.out.println("Tiene sintonizador TDT s/n :");
        String resp = leer.next();
        if (resp.equals("s") || resp.equals("S")) {
            setTDT(true);      
        }
    }

    public double precioFinal() {
          double prefinal=getPrecio();
        if (getPeso()>=1 && getPeso()<20 ) { prefinal=prefinal+100;   
        }else if (getPeso()>20 && getPeso()<50) { prefinal=prefinal+500;    
        }else if (getPeso()>50 && getPeso()<80) { prefinal=prefinal+800;    
        }else if (getPeso()>80) { prefinal=prefinal+1000;   
        }
         switch (getConsumoEnergetico()) {
            case "A":
                prefinal=prefinal+1000;
                break;
            case "B":
                prefinal=prefinal+800;       
                break;
            case "C":
                prefinal=prefinal+600;
                break;
            case "D":
                prefinal=prefinal+500;
                break;
            case "E":
                prefinal=prefinal+300;
                break;
            case "F":
                prefinal=prefinal+100;
                break;
            default:
                break;
        }       
        if (isTDT() == true) {
            prefinal=prefinal+500;
        }
        if (resolucion >= 40) { prefinal=prefinal+(prefinal*30)/100;       
        }
        setPrecio(prefinal);
        System.out.println("El valor final del Televisor es: $" + getPrecio());
        return prefinal;
        }
    
    

    @Override
    public String toString() {
        return "televisor " + " precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + ", resolucion= " + resolucion + ", TDT=" + TDT +"\n"+ '}';
    }

}
