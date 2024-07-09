package Desafio;

import java.util.Random;
import java.util.Scanner;

public class JuegoDeAdivinacion {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int numeroSecreto = new Random().nextInt(100);
        int intentos = 5;
        int numeroUsuario = 0;

        System.out.println("Numero secreto: " + numeroSecreto);

        while(intentos > 0){
            System.out.println("¿El numero secreto es?");
            numeroUsuario = teclado.nextInt();

            if(numeroUsuario == numeroSecreto){
                System.out.println("Felicidades!!! Adivinaste el numero secreto.");
                break;
            }else if(numeroUsuario < numeroSecreto){
                System.out.println("El numero que ingresaste es MENOR al numero secreto.");
            }else if(numeroUsuario > numeroSecreto){
                System.out.println("El numero que ingresaste es MAYOR al numero secreto.");
            }

            --intentos;
        }
    }
}
