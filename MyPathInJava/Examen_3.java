import java.util.Scanner;
public class PromedioPonderado_3 {

    public static void main(String[] args) {
      double Tarea,Examen,Calificacion,T_res,E_res;
      Scanner leer = new Scanner(System.in);
      
      System.out.println("la Tarea vale un 30% y el Examen un 70% ambos sobre la calificacion final");
      System.out.println("Mencione la calificacion del examen: ");
      Examen = leer.nextDouble();
      System.out.println("Mencione la calificacion de las tareas: ");
      Tarea = leer.nextDouble();
      
      T_res = (Tarea*0.70);
      E_res = (Examen*0.30);
      Calificacion = (T_res + E_res);
      
      System.out.println("La calificacion final es: " +Calificacion);
    }
    
}
