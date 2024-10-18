import java.util.Scanner;
public class G_DiasASegundos {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       
       System.out.println("Convertidor de dias a segundos");
       System.out.print("Ingresa cuantos dias desea convertir: ");
       int dias = leer.nextInt();
       
       int segundos = (dias *24*60*60);
       
       System.out.println("Existen "+segundos+(" segundos en "+dias+(" dias")));
       
       }
    
    
}
