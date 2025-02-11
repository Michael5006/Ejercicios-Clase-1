public class Main {
    public static void main(String[] args) {

        System.out.println("Resultado: " + convertirAMilisegundos(1, 2, 3, 4) + " ms");
        System.out.println("Resultado: " + convertirAMilisegundos(0, 0, 0, 1) + " ms");
        System.out.println("Resultado: " + convertirAMilisegundos(0, 1, 0, 0) + " ms");
        System.out.println("Resultado: " + convertirAMilisegundos(0, 0, 1, 0) + " ms");
        System.out.println("Resultado: " + convertirAMilisegundos(2, 0, 0, 0) + " ms");
    }

    public static long convertirAMilisegundos(int dias, int horas, int minutos, int segundos) {
        // Conversión
        return (dias * 24L * 60 * 60 * 1000) +  // Días a milisegundos
                (horas * 60L * 60 * 1000) +      // Horas a milisegundos
                (minutos * 60L * 1000) +         // Minutos a milisegundos
                (segundos * 1000L);              // Segundos a milisegundos
    }
}
