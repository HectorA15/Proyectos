import java.util.Scanner;

public class Info {

    public Lista Datos(){
        Scanner sc = new Scanner(System.in);

        Lista lista = new Lista();

        String patron_Hora = "^([01]?\\d|2[0-3]):[0-5]\\d$";
        String patron_Fecha = "^([0-2]?\\d|3[01])/(0[1-9]|(1[0-2]))$";

        System.out.print("Nombre: ");
        lista.SetNombre(sc.nextLine());

        System.out.print("Descripcion: ");
        lista.SetDescripcion(sc.nextLine());


        while(true){
            System.out.println("Fecha (Dia/Mes): ");
            String FechaIn = sc.nextLine();

            if (FechaIn.matches(patron_Fecha)){
                lista.SetFecha(FechaIn);
                break;
            } else {
                System.out.println("Error en el formato de Fecha");}
        }

        while(true){

            System.out.println("Hora (Hora:Minuto): ");
            String HoraIn = sc.nextLine();

            if (HoraIn.matches(patron_Hora)){
                lista.SetHora(HoraIn);
                break;
            } else {
                System.out.println("Error en el formato de la hora");}
        }
        lista.SetEstado(false);

        return lista;
    }

}
