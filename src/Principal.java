public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.nombre = "The Matrix";
        miPelicula.fechaDeLanzamiento = 1999;
        miPelicula.duracionEnMinuto = 120;
        miPelicula.incluidoEnElPlan = true;

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(9);

        System.out.printf("Suma total de evaluaciones: %.2f \n",miPelicula.sumaDeLasEvaluaciones);
        System.out.printf("Total de las evaluaciones: #%d \n", miPelicula.totalDeLasEvaluaciones);
        System.out.printf("La media es: %.2f \n" ,miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.nombre = "Encanto";
        otraPelicula.fechaDeLanzamiento = 2021;
        otraPelicula.duracionEnMinuto = 120;
        otraPelicula.incluidoEnElPlan = true;
    }
}
