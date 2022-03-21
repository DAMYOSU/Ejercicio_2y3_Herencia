
package entidadesElectro;

import java.util.Scanner;


/**
 *
 * @author DAMY
 */
public class electrodomestico {
    protected double precio;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;

    public electrodomestico() {
    }

    public electrodomestico(double precio, String color, String consumoEnergetico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    

    public String comprobarConsumoEnergetico(){
      Scanner leer = new Scanner(System.in);
        String f="F";
        
        System.out.println("Ingrese consumo electrico:");
       String letra = leer.next();
        //char[] conEnergetico = letra.toCharArray();
        if (!letra.equals("A") && !letra.equals("B") && !letra.equals("C") && !letra.equals("D") && !letra.equals("D")) { 
        letra=f;
        
        }
        setConsumoEnergetico(letra);
    return letra;
    }
    

    public String comprobarColor (){
    Scanner leer = new Scanner(System.in);
        
        if (!color.equals("negro") && !color.equals("rojo") && !color.equals("azul") && !color.equals("gris")) {
          color="blanco";
        } 
        setColor(color);
        return color; 
    }

    public void crearElectrodomestico(){
    Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("***   C R E A R     E L E C T R O D O M E S T I C O   ***");
        System.out.println("Ingrese el precio: ");
        setPrecio(leer.nextDouble());
        System.out.println("Ingrese el color");    
        setColor(leer.next());
        comprobarColor();
        comprobarConsumoEnergetico();
        System.out.println("Ingrese el peso en Kg:");
        setPeso(leer.nextDouble());
           
    }

    
    public double precioFinal(){
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
        return prefinal;
    }

    @Override
    public String toString() {
        return "electrodomestico " + "precio= " + precio + ", color= " + color + ", consumoEnergetico= " + consumoEnergetico + ", peso= " + peso + "\n"+'}';
    }
    
}
