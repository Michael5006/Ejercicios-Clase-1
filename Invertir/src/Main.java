public class Main {
    public static void main(String[] args) {
        String texto = "Hola mundo";

        System.out.println("Texto Original: " + texto);

        System.out.print("Texto Invertido: ");
        for (int i = texto.length() - 1; i >= 0; i--) {
            System.out.print(texto.charAt(i));
        }
    }
}
