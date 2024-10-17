import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Code made by Hector A. 17/10/2024

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Lista> tareas = Lista.cargarTareas();

        mostrarTareas(tareas);

        while (true) {
            System.out.println("Que desea hacer?");
            System.out.println("1. Agregar algo");
            System.out.println("2. Editar algo");
            System.out.println("3. Eliminar algo");
            System.out.println("4. Salir");
            String patron_respuesta = "^[1-4]$";
            String respuesta = sc.nextLine();

            if (respuesta.matches(patron_respuesta)) {
                switch (respuesta) {
                    case "1":
                        Info pedir = new Info();
                        Lista nuevaTarea = pedir.Datos();
                        tareas.add(nuevaTarea);
                        Lista.guardarTareas(tareas);
                        System.out.println("Tarea añadida y guardada.");
                        mostrarTareas(tareas); // Mostrar la lista después de agregar
                        break;

                    case "2":
                        System.out.print("Ingrese el ID de la tarea a editar: ");
                        int idEditar = Integer.parseInt(sc.nextLine());
                        if (idEditar >= 0 && idEditar < tareas.size()) {
                            Info infoEditar = new Info();
                            Lista tareaEditar = infoEditar.Datos();  // Llenar los datos nuevos
                            tareas.set(idEditar, tareaEditar); // Reemplaza la tarea
                            Lista.guardarTareas(tareas);
                            System.out.println("Tarea editada y guardada.");
                            mostrarTareas(tareas); // Mostrar la lista después de editar
                        } else {
                            System.out.println("ID de tarea no válido.");
                        }
                        break;

                    case "3":
                        System.out.print("Ingrese el ID de la tarea a eliminar: ");
                        int idEliminar = Integer.parseInt(sc.nextLine());
                        if (idEliminar >= 0 && idEliminar < tareas.size()) {
                            tareas.remove(idEliminar);
                            Lista.guardarTareas(tareas);
                            System.out.println("Tarea eliminada.");
                            mostrarTareas(tareas); // Mostrar la lista después de eliminar
                        } else {
                            System.out.println("ID de tarea no válido.");
                        }
                        break;

                    case "4":
                        System.out.println("Saliendo...");
                        sc.close();
                        return;
                }
            } else {
                System.out.println("Menciona una opcion valida");
            }
        }
    }
    //Mostrar la lista de tareas
    private static void mostrarTareas(ArrayList<Lista> tareas) {
        if (tareas.isEmpty()) {
            System.out.println("No tienes tareas pendientes.");
        } else {
            System.out.println("Tareas pendientes:");
            for (int i = 0; i < tareas.size(); i++) {
                System.out.print("ID: " + i + " - ");
                tareas.get(i).GetLista();
                System.out.println("---------------------------------------------------------------");
            }
        }
    }
}
