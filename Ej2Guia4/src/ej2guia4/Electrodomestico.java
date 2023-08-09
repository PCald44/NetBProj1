package ej2guia4;

public class Electrodomestico {

    protected double precio;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumoEnergetico, double peso) {
        this.precio=precio;
        this.color=color;
        this.consumoEnergetico=consumoEnergetico;
        this.peso=peso;
        
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

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    

    protected void comprobarConsumoEnergetico(){
    
         
    } 
       
    

    
    
    
    protected void comprobarColor(String color) {
         switch (color){
            case "blanco":
                this.color="blanco";
                break;
                case "negro":
                this.color="negro";
                break;
                case "rojo":
                this.color="rojo";
                break;
                case "azul":
                this.color="azul";
                break;
                case "gris":
                this.color="gris";
                break;
                default: this.color="blanco";
                
        } 
        
    }

    public void precioFinal() {
        
        switch (consumoEnergetico){
            case 'a':
                this.precio+=1000;
                break;
                case 'b':
                this.precio+=800;
                break;
                case 'c':
                this.precio+=600;
                break;
                case 'd':
                this.precio+=500;
                break;
                case 'e':
                this.precio+=300;
                break;
                case 'f':
                this.precio+=100;
                break;
                default: this.consumoEnergetico='f';
                
        } 
        
        if(peso>=1 && peso<=19){
         precio=this.precio+100;
        }else
        
        if(peso>=20 && peso<=49){
         precio=this.precio+500;
        }else
        
        if(peso>=50 && peso<=79){
         precio=this.precio+800;
        }else
        if(peso>=80 ){
         precio=this.precio+1000;
        }
        System.out.println(precio);
    }

    
}
