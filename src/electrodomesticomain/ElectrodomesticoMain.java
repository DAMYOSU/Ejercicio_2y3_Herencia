package electrodomesticomain;

import entidadesElectro.*;
import java.util.ArrayList;

/**
 *
 * @author DAMY
 */
public class ElectrodomesticoMain {

    public static void main(String[] args) {
        ArrayList<entidadesElectro.electrodomestico> lista = new ArrayList<>();
        entidadesElectro.lavadora lavadora = new lavadora();
        entidadesElectro.televisor televisor = new televisor();
       
        lavadora.creaLavadora();
        lavadora.precioFinal();
        televisor.creaTelevisor();
        televisor.precioFinal();
        
        
        System.out.println("");
        System.out.println("----------------------------------------------------------------------\n ***   EJERCICIO 3   ***");
        System.out.println("");
        lavadora l1 = new lavadora(30, 3000, "gris", "A", 30);
        lavadora l2 = new lavadora(50, 4000, "blanco", "A", 40); 
        televisor t1 = new televisor(60, true, 3000, "negro", "A", 22);
        televisor t2 = new televisor(20, true, 4000, "blanco", "B", 60);
        lista.add(l1);
        lista.add(l2);
        lista.add(t1);
        lista.add(t2);
      
        double sumafinal=0;
        for (electrodomestico aux : lista) {
            aux.precioFinal();
            sumafinal=sumafinal+aux.getPrecio(); 
        }
        System.out.println("El precio de todos los Televisores es $" + (t1.getPrecio()+t2.getPrecio()) + "\nEl precio de todas las Lavadoras es de $" + (l1.getPrecio()+l2.getPrecio()) + "\nLa suma total de los electrodomesticos es $" + sumafinal);
        System.out.println("");

    }
}
