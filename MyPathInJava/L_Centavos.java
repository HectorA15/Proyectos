import java.util.Scanner;

public class L_Centavos {

    public static void main(String[] args) {
        
        double precio;
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Vamos a comprar lapices!");
        System.out.print("Cuantos lapices quieres comprar? :");
        int lapiz = leer.nextInt();
        
        
        if (lapiz >= 1000){
            precio = lapiz * 0.85;
        }
        else{
            precio = lapiz * 0.90;
           
        }
        System.out.println("El costo total seria: $"+precio);
        
    }
    
}
