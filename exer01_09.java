import java.util.Scanner;

class exer01_09 {
    public static void main(String[] args) {
        // Declarção das variavies;
        float F;
        Float C;
        // Declarando objeto do Scanner:
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual a temperatura em Fahrenheit? ");
        F = teclado.nextFloat();
        C = 5 * ((F - 32) / 9);
        System.out.printf("A temperatura em graus celsius é: %.0f", (C));
        System.out.println("°C");

    }
}