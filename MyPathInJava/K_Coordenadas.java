import java.util.Scanner;
public class K_Coordenadas {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Vamos a calcular la distancia entre dos puntos!");
        System.out.println("Escribe 2 coordenadas para ello... ");
        
        System.out.print("Escribe el punto X de la primera coordenada: ");
        double x1 = leer.nextDouble();
        System.out.print("Escribe el punto Y de la primera coordenada: ");
        double y1 = leer.nextDouble();
        System.out.print("Escribe el punto X de la segunda coordenada: ");
        double x2 = leer.nextDouble();
        System.out.print("Escribe el punto Y de la segunda coordenada: ");
        double y2 = leer.nextDouble();
        
        double distancia = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2)); 
        
        
        System.out.println("La distancia entre el punto "+x1+","+y1+ " y el punto "+x2+","+y2+" Es: "+distancia);

  
                 
    }
    
}
