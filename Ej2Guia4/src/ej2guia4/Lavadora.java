package ej2guia4;


import ej2guia4.Electrodomestico;

public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga, double precio, String color, char consumoEnergetico, double peso) {
        super(precio,color,consumoEnergetico,peso);
        this.carga=carga;
        
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    

    @Override
    public void precioFinal() {
        super.precioFinal();
        if(carga<=30){
        this.precio=precio;
        }else{
            precio=precio+500;
        }
        //System.out.println(precio);
    }
}
