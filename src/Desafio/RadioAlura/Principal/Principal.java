package Desafio.RadioAlura.Principal;

import Desafio.RadioAlura.Modelos.Cancion;
import Desafio.RadioAlura.Modelos.MisFavoritos;
import Desafio.RadioAlura.Modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("Forever");
        miCancion.setCantante("Kiss");

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguiar");
        miPodcast.setTitulo("Cafe.Tech");

        for (int i = 0; i < 1000; i++) {
            miCancion.meGusta();
        }

        for (int i = 0; i < 50000; i++) {
            miCancion.reproduce();
        }

        // Podcast
        for (int i = 0; i < 10000; i++) {
            miPodcast.meGusta();
        }

        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Canción: " + miCancion.getTitulo());
        System.out.println("Total Me gusta: " + miCancion.getTotalDeMeGusta());
        System.out.println("Total Reproducciones: " + miCancion.getTotalDeReproducciones());

        // Utilizando la clasificación de Me Gusta
        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miCancion);
        favoritos.adicione(miPodcast);
    }
}
