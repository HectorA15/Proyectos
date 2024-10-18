import java.util.Scanner;
public class TiposDeVariables_5 {

    public static void main(String[] args) {
       
    Scanner entrada = new Scanner(System.in);
    entrada.useDelimiter("\n");
    
    //introducir datos enteros
    System.out.print("introduce un umero entero: ");
    int entero = entrada.nextInt();
    System.out.println("El numeroentero introducido es: " + entero);
    
    //introducir datos decimales
    System.out.print("introduce un valor decimal: ");
    double decimal = entrada.nextDouble();
    System.out.println("El numero decimal introducido es: " + decimal);
    
    //introducir datos booleanos
    System.out.print("introduce un valor booleano (true/false): ");
    boolean booleano = entrada.nextBoolean();
    System.out.println("El numero booleano introducido es: " + booleano);
    
    //introducir datos de tipo String
    System.out.print("Introduce una cadena de texto: ");
    String cadena = entrada.next();
    System.out.println("La cadena de texto introducida es: " +  cadena);
    
    //introducir datos de caracteres
    System.out.print("Introduc un caracter: ");
    char caracter = entrada.next().charAt(0);
    System.out.println("el caracter introducido es:  " + caracter);
    
    //introducir datos de tipo float
    System.out.print("Introduce un numero decimal de precision simple: ");
    float flotante = entrada.nextFloat();
    System.out.println(" = " + flotante);
    
    //introducir datos de tipo long
    System.out.print("introduce un numero entero largo: ");
    long largo = entrada.nextLong();
    System.out.println("El numero entero largo introducido es: " + largo);
    
    //introducir datos de tipo byte
    System.out.print("Introduce un numero entero de 8 bits: ");
    byte bit8 = entrada.nextByte();
    System.out.println("El numero entero de 8 bits introducido es: " + bit8);
    
    //introducir datos de tipo short
    System.out.print("Introduce un numero entero corto: ");
    short corto = entrada.nextShort();
    System.out.println("El numero entero corto introducido es: " + corto);
    
    }
    
}
