
package cine;

public class Boleto {
    
    double precio;
    int hora;
    
    public Boleto(){
        
    }
    
    
    public Boleto(double p,int h){
        this.precio = p;
        this.hora = h;
    }
    
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }
    
    public double getPrecio() {
        return precio;
    }

    public int getHora() {
        return hora;
    }

    
}
