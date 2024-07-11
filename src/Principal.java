public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "The Matrix";
        miPelicula.fechaDeLanzamiento = 1999;
        miPelicula.duracionEnMinuto = 120;
        miPelicula.incluidoEnElPlan = true;

        System.out.println("Mi pelicula es: " + miPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + miPelicula.fechaDeLanzamiento);

        Pelicula otraPelicula = new Pelicula();

        otraPelicula.nombre = "Encanto";
        otraPelicula.fechaDeLanzamiento = 2021;
        otraPelicula.duracionEnMinuto = 120;
        otraPelicula.incluidoEnElPlan = true;

        System.out.println("Mi pelicula es: " + otraPelicula.nombre);
        System.out.println("Su fecha de lanzamiento es: " + otraPelicula.fechaDeLanzamiento);
    }
}
