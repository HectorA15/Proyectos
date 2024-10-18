import java.util.Scanner;
//Hector A.
public class A_SRMD {

    public static void main(String[] args) {
    
    double suma,resta,division,mult,num1,num2;
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingresa dos numeros: ");
    num1 = leer.nextDouble();
    num2 = leer.nextDouble();
    
    suma = (num1+num2);
    resta = (num1-num2);
    division =(num1/num2);
    mult = (num1*num2);
    
    System.out.println(num1+" sumado por "+num2+" es igual a: "+suma);
    System.out.println(num1+" restado por "+num2+" es igual a: "+resta);
    System.out.println(num1+" dividido por "+num2+" es igual a: "+ division);
    System.out.println(num1+" multiplicado por "+num2+" es igual a: "+mult);
    }
    
}
