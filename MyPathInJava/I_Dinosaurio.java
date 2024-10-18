import java.util.Scanner;
public class I_Dinosaurio {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        //Pedimos el nombre, peso y altura del dinosaurio en libras y pies
        System.out.print("Cual es el nombre del dinosaurio?: ");
        String Dino = leer.next();
        
        System.out.print("Menciona su altura en pies: ");
        double AltPies = leer.nextDouble();
        System.out.print("Menciona su peso en libras: ");
        double PesLibras = leer.nextDouble();
        
        //Convertimos las libras y los pies a kilos y metros
        
        double PesKg = (PesLibras / 2.20462);
        double AltMetros = (AltPies * 0.3048);
        
        //Mencionamos como salida los datos en ambos sistemas de unidades
        System.out.println("El dinosaurio "+Dino+" tiene un peso de: "+PesLibras+" libras, y una altura de "+AltPies+" pies");
        System.out.println("Y en el sistema metrico");
        System.out.println("El dinosaurio "+Dino+" tiene un peso de: "+PesKg+" kilogramos, y una altura de "+AltMetros+" metros");
    }
    
}
