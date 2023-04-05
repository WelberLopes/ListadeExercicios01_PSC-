
import java.util.Scanner;
import javax.swing.*;

class exer01_04 {
    public static void main(String[] args) {
        // Declarção das variavies;
        int nota1;
        int nota2;
        int nota3;
        int nota4;
        int media;
        // Declarando objeto do Scanner:
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua nota de avaliação para o primeiro bimestre?");
        nota1 = teclado.nextInt();
        System.out.println("Qual a sua nota de avaliação para o segundo bimestre?");
        nota2 = teclado.nextInt();
        System.out.println("Qual a sua nota de avaliação para o terceiro bimestre?");
        nota3 = teclado.nextInt();
        System.out.println("Qual a sua nota de avaliação para o quarto bimestre?");
        nota4 = teclado.nextInt();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.print("A nota média bimestral foi: ");
        System.out.print(media);

        JOptionPane.showMessageDialog(null, "A nota média bimestral foi: " + (media));

    }
}
