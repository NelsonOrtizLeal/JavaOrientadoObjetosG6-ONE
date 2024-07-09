import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double nota = 0;
        double mediaEvaluacion = 0;
        String pelicula = "Matrix";
        int numeroEvaluaciones = 0;

        while(nota >= 0){
            System.out.printf("Califica la película: %s \n", pelicula);
            nota = teclado.nextDouble();
            if(nota >= 0){
                mediaEvaluacion += nota;
                numeroEvaluaciones++;
            }
        }

        // Mostrar el promedio
        System.out.printf("Película: %s \nCalificacion: %.1f", pelicula, mediaEvaluacion/numeroEvaluaciones);
    }
}
