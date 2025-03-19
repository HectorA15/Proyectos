package cine;

import java.util.Scanner;

public class CIne {

    public static void main(String[] args) {

        double precio;
        String input;
        int exit;
        int hora;

        hora = 0;

        Scanner sc = new Scanner(System.in);

        Boleto boleto = new Boleto();

        System.out.println("En que horario vas a ver la pelicuala");
        System.out.println("  4:00 | precio: $50");
        System.out.println("  7:00| precio: $63");
        System.out.println(" 10:00| precio: $86");
        do {
            exit = 0;

            input = sc.nextLine().replaceAll(":","");
            hora = Integer.parseInt(input);
            

            switch (hora) {
                case 400:
                    boleto.setPrecio(50);
                    System.out.println("El precio del boleto es $" + boleto.getPrecio());

                    break;

                case 700:
                    boleto.setPrecio(63);
                    System.out.println("El precio del boleto es $" + boleto.getPrecio());
                    break;

                case 1000:
                    boleto.setPrecio(86);
                    System.out.println("El precio del boleto es $" + boleto.getPrecio());
                    break;

                default:


                    System.out.println("-------------------Ingrese una funcion disponible-------------------");
                    exit = 1;
                    break;
            }
        } while (exit == 1);

    }

}
