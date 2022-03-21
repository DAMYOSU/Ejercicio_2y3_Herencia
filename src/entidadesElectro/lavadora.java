
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
     setPrecio(prefinal);      
        if (getCarga() > 30) {
           prefinal = getPrecio()+500;
        } else prefinal=getPrecio();
        setPrecio(prefinal);
         System.out.println("El valor final de la Lavadora es: $" + getPrecio());   
        return prefinal;
    }

    
    @Override
    public String toString() {
        return "**Informacion adicional de Lavadora: " + "precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + ", carga= " + carga +"\n"+ '}';
    } 

}
