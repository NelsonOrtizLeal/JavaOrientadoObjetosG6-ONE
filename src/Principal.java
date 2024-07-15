import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

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

        // Agregando otra pelicula
        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Encanto");
        otraPelicula.setFechaDeLanzamiento(2022);
        otraPelicula.setDuracionEnMinuto(180);

        otraPelicula.muestraFichaTecnica();

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
        System.out.printf("Terminar la serie te tomara: %d minutos\n", casaDragon.getDuracionEnMinuto());

        System.out.println("***********************************");

        // Utilizando la clase para calcular el tiempo
        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.printf("Tiempo necesario para ver tus titulos favoritos: %d", calculadora.getTiempoTotal());

        System.out.println("***********************************");
        // Para mostrar la clasificación de un OBJETO CLASIFICABLE
        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();

        System.out.println("La pelicula: " + miPelicula.getNombre());
        filtroRecomendacion.filtrar(miPelicula);

        // Evaluación de un episodio
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa Targaryen");
        episodio.setSerie(casaDragon);
        episodio.setTotalvisualizaciones(101);

        System.out.println("El episodio: " + episodio.getNombre());
        filtroRecomendacion.filtrar(episodio);

        System.out.println("***********************************");
        var peliculaDeNelson = new Pelicula();
        peliculaDeNelson.setNombre("El señor de los anillos");
        peliculaDeNelson.setFechaDeLanzamiento(2001);
        peliculaDeNelson.setDuracionEnMinuto(180);

        // Manipulando ArrayList
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);
        listaDePeliculas.add(peliculaDeNelson);

        // Operando con una lista
        System.out.println("El tamaño de la lista es: "+ listaDePeliculas.size());
        System.out.println("La primera pelicula es: " + listaDePeliculas.get(0).getNombre());

        System.out.println(listaDePeliculas);
    }
}
