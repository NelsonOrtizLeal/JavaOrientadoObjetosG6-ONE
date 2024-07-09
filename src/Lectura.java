import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //Información de una pelicula
        System.out.println("Escribe el nombre de la pelicula:");
        String pelicula = teclado.nextLine();
        System.out.println("Escriba el año de lanzamiento:");
        int fechaDeLanzamiento = teclado.nextInt();
        boolean incluidaEnElPlan = true;
        System.out.println("Que nota le da a esta pelicula:");
        double notaDeLaPelicula = teclado.nextDouble();

        // Mostrar la información de la pelicula
        System.out.printf("""
                Pelicula: %s
                Año: %d
                Calificacion: %.1f
                """, pelicula, fechaDeLanzamiento, notaDeLaPelicula);
    }
}
