import java.util.Scanner;
public class Cambio_6 {

    public static void main(String[] args) {
        
        double precio, efectivo, cambio;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Mencione el precio del produco: $");
        precio = leer.nextDouble();
        
        System.out.print("Menciona la cantidad de dinero que tien consigo: $");
        efectivo = leer.nextDouble();
        
        cambio = (efectivo - precio);
        System.out.print("Su cambio es de: " + cambio);
        
              
    }
    
}
