public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidaEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;

        System.out.printf("Lanzamiento: %d \nIncluida: %b \nNota: %.2f \nMedia: %.2f%n", fechaDeLanzamiento, incluidaEnElPlan, notaDeLaPelicula, media);

        System.out.println("Sinopsis de pelicula:");

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fué lanzada en: %s
               """.formatted(fechaDeLanzamiento);

        System.out.println(sinopsis);

        int clasificacion = (int) media / 2;
        System.out.printf("Califiacion: \n%d - 5 Estrellas",clasificacion);
    }
}
