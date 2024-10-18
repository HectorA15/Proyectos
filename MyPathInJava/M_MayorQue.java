import java.util.Scanner;
public class M_MayorQue {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Tecle el primer numero: ");
        int C1 = leer.nextInt();
        
        System.out.println("Teclea el segundo numero: ");
        int C2 = leer.nextInt();
        
        if (C1 > C2) {
            System.out.println(C1 + " Es mayor que "+C2);
            
            
        }
        else if(C1 == C2){
            System.out.println(C1 +" es igual a " +C2);
        }
        else{
            System.out.println(C2 +" Es mayor que "+ C1);
        }
    }
    
}
