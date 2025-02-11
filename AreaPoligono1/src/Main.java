public class Main {
    public static void main(String[] args) {
        System.out.println("Área del triángulo: " + calcularArea("triangulo", 5, 10));
        System.out.println("Área del cuadrado: " + calcularArea("cuadrado", 4, 0));
        System.out.println("Área del rectángulo: " + calcularArea("rectangulo", 4, 8));

        // En caso de que se quiera probar si la función detecta  un poligono no válido, quitar el comentario del SOUT
        //System.out.println("Área de un polígono no válido: " + calcularArea("pentagono", 5, 5)); // Esperado: -1
    }

    public static double calcularArea(String tipo, double dimension1, double dimension2) {
        return switch (tipo) {
            case "triangulo" -> (dimension1 * dimension2) / 2;
            case "cuadrado" -> dimension1 * dimension1;
            case "rectangulo" -> dimension1 * dimension2;
            default -> -1; // Profe, usé el -1 para que detecte cuando haya un error en el area, no usé el numero 0 porque se puede confundir con un área real.
        };
    }

}