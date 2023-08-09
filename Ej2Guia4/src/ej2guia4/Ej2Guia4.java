/*
 * 
 */
package ej2guia4;

/**
 *
 * @author marcelaaliciaarroyo
 */
public class Ej2Guia4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Electrodomestico lavadora1=new Lavadora(10, 30000, "negro", 'a', 45);
        //lavadora1.comprobarConsumoEnergetico();
        //lavadora1.comprobarColor("negro");
        lavadora1.precioFinal();
        
        
        Electrodomestico televisor1=new Televisor(30, true, 90000, "negro",'a',40);
        //televisor1.comprobarConsumoEnergetico();
        //televisor1.comprobarColor("blanco");
        televisor1.precioFinal();
    }
    
}
