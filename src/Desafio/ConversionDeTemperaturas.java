package Desafio;

public class ConversionDeTemperaturas {
    public static void main(String[] args) {
        System.out.println("Convertidor de temperatuas");

        double gradosCelsius = 30.4;
        int gradosFahrenheit = (int) (gradosCelsius * 1.8) + 32;

        System.out.printf("Celcius: %.2f \t Faherenheit: %d", gradosCelsius,gradosFahrenheit);
    }
}
