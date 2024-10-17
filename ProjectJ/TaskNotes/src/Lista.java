import java.io.*;
import java.util.ArrayList;

public class Lista implements Serializable {
    private int id;
    private String nombre;
    private String descripcion;
    private boolean estado;
    private String fecha;
    private String hora;

    //Getter y setter del ID
    public void SetId(int id) {
        this.id = id;
    }
    public int GetId() {
        return id;
    }

    //Getter y Setter del nombre
    public void SetNombre(String nombre) {
        this.nombre = nombre;
    }
    public String GetNombre() {
        return nombre;
    }

    //Getter y Setter de la descripcion
    public void SetDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String GetDescripcion() {
        return descripcion;
    }

    public void SetFecha(String fecha){
        this.fecha = fecha;
    }
    public String GetFecha(){
        return fecha;
    }

    public void SetHora(String hora){
        this.hora = hora;
    }
    public String GetHora(){
        return hora;
    }

    //Getter y Setter del Estado de la tarea
    public void SetEstado(boolean estado) {
        this.estado = estado;
    }
    public boolean GetEstado() {
        return estado;
    }


    public void GetLista() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Fecha: " + fecha + "/2024" + "   Hora: " + hora );
        System.out.println("Estado: " + (estado ? "Completada" : "Pendiente"));
    }

    // Para guardar los datos en un archivo txt serializándolo
    public static void guardarTareas(ArrayList<Lista> tareas) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tareas.txt"))) {
            out.writeObject(tareas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Función para leer las tareas
    public static ArrayList<Lista> cargarTareas() {
        ArrayList<Lista> tareas = new ArrayList<>();
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("tareas.txt"))) {
            tareas = (ArrayList<Lista>) in.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No hay tareas guardadas o error al leer archivo.");
        }
        return tareas;
    }


    //Funcion de eliminar tareas
    public void EliminarTareas() {
        this.estado = true;
    }



}
