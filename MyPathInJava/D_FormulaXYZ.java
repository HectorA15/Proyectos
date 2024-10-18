import java.util.Scanner;
public class D_FormulaXYZ {

    public static void main(String[] args) {
        
        double x,y,z,r;
        Scanner leer = new Scanner(System.in);
        System.out.print("ingrese el valor de x: ");
        x = leer.nextDouble();
        System.out.print("ingrese el valor de y: ");
        y = leer.nextDouble();
        System.out.print("ingrese el valor de z: ");
        z = leer.nextDouble();
        
        r = ((((2*x + y)/z)*(y*y*y - z))/(((x+2*y+3*z)/(z-2*y-3*x))+(x*x+z*z)));
        
        System.out.println("el resultado es: " +r);
    }
    
}
