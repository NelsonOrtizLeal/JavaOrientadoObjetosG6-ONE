import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();

        miPelicula.setNombre("The Matrix");
        miPelicula.setFechaDeLanzamiento(1999);
        miPelicula.setDuracionEnMinuto(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(9);

        System.out.printf("Total de las evaluaciones: #%d \n", miPelicula.getTotalDeLasEvaluaciones());
        System.out.printf("La media es: %.2f \n" ,miPelicula.calculaMedia());

        System.out.println("***********************************");

        // Agregando una serie
        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);

        casaDragon.muestraFichaTecnica();
        // Quiero saber cuanto tiempo me tomara terminar toda la serie
        System.out.printf("Terminar la serie te tomara: %d minutos", casaDragon.getDuracionEnMinuto());
    }
}
