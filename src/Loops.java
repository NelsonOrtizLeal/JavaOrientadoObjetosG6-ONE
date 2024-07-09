import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluacion = 0;
        String pelicula = "Matrix";

        for (int i = 0; i < 3; i++) {
            System.out.printf("Califica la película: %s \n", pelicula);
            nota = teclado.nextDouble();
            mediaEvaluacion = mediaEvaluacion + nota;
        }

        // Mostrar el promedio
        System.out.printf("Película: %s \nCalificacion: %.1f", pelicula, mediaEvaluacion/3);
    }
}
