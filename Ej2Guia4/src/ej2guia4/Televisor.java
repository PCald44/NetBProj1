package ej2guia4;


import ej2guia4.Electrodomestico;

public class Televisor extends Electrodomestico {

    private double resolucion;

    private boolean sintonizadorTDT;

    public Televisor() {
    }

    public  Televisor(double resolucion, boolean sintonizadorTDT, double precio, String color, char consumoEnergetico, double peso) {
    super(precio,color,consumoEnergetico,peso);
    this.resolucion=resolucion;
    this.sintonizadorTDT=sintonizadorTDT;
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(resolucion<40){
            precio=precio;
        }else{
            precio=precio+0.3*precio;
        }
        
        if(sintonizadorTDT){//si es verdadero entra en el if
        precio=precio+500;
        }
        System.out.println(precio+"teleconsintoni");
    }
    
}
