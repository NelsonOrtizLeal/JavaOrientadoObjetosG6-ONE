package Desafio;

import java.util.Scanner;

public class CajeroBanco {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        // Inicialiar valores del usuario
        String cliente = "Nelson";
        String tipoCuenta = "Corriente";
        double saldo = 100;

        int opcionCajero = 0;

        System.out.println("*******************************");
        System.out.println("\t\t Bienvenido \n");
        System.out.println("Nombre del cliente: "+ cliente);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo Disponible: $" + saldo);
        System.out.println("\n*******************************");


        while (opcionCajero != 9){

            System.out.println("** Escriba el número de la opción deseada **");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Retirar");
            System.out.println("3 - Depositar");
            System.out.println("9 - Salir");

            opcionCajero = teclado.nextInt();

            // Opciones del menu
            switch(opcionCajero) {
                case 1:
                    System.out.println("El saldo actual es: $" + saldo);
                    break;
                case 2:
                    System.out.println("¿Cantidad a retirar?");
                    double retirar = teclado.nextDouble();
                    if(retirar > saldo){
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -= retirar;
                        System.out.println("Su saldo es: $" + saldo);
                    }
                    break;
                case 3:
                    System.out.println("¿Cantidad a depositar?");
                    double deposito = teclado.nextDouble();
                    saldo += deposito;
                    System.out.println("Su saldo es: $" + saldo);
                    break;
                case 9:
                    System.out.println("Saliendo del programa, gracias por utilizar nuestro servicios.");
                    break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }
    }

    // Metodo para consultar el saldo
}
