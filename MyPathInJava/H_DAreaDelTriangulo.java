import java.util.Scanner;
public class H_AreaDelTriangulo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.print("Para determinar el area de un triangulo, ingrese las medidas de los 3 lados en centimetros: ");
        
        double lado1 = leer.nextDouble();
        double lado2 = leer.nextDouble();
        double lado3 = leer.nextDouble();

        double s = (lado1 + lado2 + lado3) / 2;

        double area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));

        System.out.println("Las medidas de tu triangulo son: ");
        System.out.println(lado1 + " cm");
        System.out.println(lado2 + " cm");
        System.out.println(lado3 + " cm");
        System.out.print("El area del triangulo es: " +area+ " cm");
    
    }
    
}
