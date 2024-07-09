public class Decisiones {
    public static void main(String[] args) {
        //Información de una pelicula
        int fechaDeLanzamiento = 1999;
        boolean incluidaEnElPlan = true;
        double notaDeLaPelicula = 8.2;
        int anio = 2022;
        String tipoPlan = "plus";

        // Condicional para mostrar un mensaje
        if(fechaDeLanzamiento >= anio){
            System.out.println("Peliculas más populares");
        }else{
            System.out.println("Película retro que aún vale la pena ver.");
        }

        // Condicional para permitirle ver a el usuario una pelicula
        if(incluidaEnElPlan || tipoPlan.equals("plus")){
            System.out.println("Disfrute su película");
        }else{
            System.out.println("Esta película no esta disponible para su plan actual.");
        }
    }
}
