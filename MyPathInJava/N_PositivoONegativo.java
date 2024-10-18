package pos;
import java.util.Scanner;
public class N_PositivoONegativo {


    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Menciona un número: ");
        double N1 = leer.nextDouble();
        
        if(N1>0){
            System.out.println(N1 + " es un numero positivo ");
            
        }
        else if (N1 == 0) {
            System.out.println(N1 +" es igual a 0");
        }
        else{
            System.out.println(N1 +"es un numero negativo");
        }
    }
    
}
