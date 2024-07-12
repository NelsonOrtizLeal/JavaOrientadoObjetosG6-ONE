import com.aluracursos.screenmatch.modelos.Pelicula;

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

        System.out.printf("Total de las evaluaciones: #%d \n", miPelicula.getTotalDeLasEvaluaciones());
        System.out.printf("La media es: %.2f \n" ,miPelicula.calculaMedia());
    }
}
