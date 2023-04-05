import java.util.Scanner;
import javax.swing.JOptionPane;

public class exer01_03 {
    public static void main(String[] args) throws Exception {

        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número a ser somado: ");
        a = sc.nextInt();
        System.out.println("Dgite o segundo número: ");
        b = sc.nextInt();
        sc.close();

        int resultado = a + b;

        System.out.println("A soma de " + (a) + " e " + (b) + " resulta em: " + (resultado));
        JOptionPane.showMessageDialog(null, "A soma de a e b resulta em: " + (resultado));

    }
}