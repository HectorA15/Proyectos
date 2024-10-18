import java.util.Scanner;
public class J_GasolinaConsumo {
    public static void main(String[] args) {
        double galones, litros, precio, cobro;
        Scanner leer = new Scanner(System.in);
        
        System.out.print("¿Cuanto cuesta el litro de la gasolina?: ");
        precio = leer.nextDouble();
        System.out.println("El precio del litro de gasolina cuesta: $"+precio);
        
        System.out.print("Cuantos GALONES estadounidenses de gasolina le va meter al coche?: ");
        galones = leer.nextDouble();
        
        litros = (galones*3.785411784);
        cobro = (litros*precio);
        System.out.println("Usted consumio " +litros+ " litros de gasolina, con un precio total de " +cobro);
    }
}
