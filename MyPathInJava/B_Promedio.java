
package B_Promedio;

import java.util.Scanner;
//Hector Armando Castro Obele
public class PROM {

    public static void main(String[] args) {
        
        double n1,n2,n3,n4,n5,promedio,suma;
        Scanner leer = new Scanner(System.in);
        System.out.print("ingresa 5 valores a promediar: ");
        
        n1 = leer.nextDouble();
        n2 = leer.nextDouble();
        n3 = leer.nextDouble();
        n4 = leer.nextDouble();
        n5 = leer.nextDouble();
        
        suma = (n1 + n2 + n3 + n4 + n5);
        promedio = (suma/5);
        
        System.out.print("el promedio de los 5 numeros es: " +promedio);
        
        
        // TODO code application logic here
    }
    
}
