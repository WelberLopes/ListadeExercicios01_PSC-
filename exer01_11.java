import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class exer01_11 {
    public static void main(String[] args) throws Exception {

        int a;
        double b;
        double r1, r2, r3;

        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");
        DecimalFormat deci2 = new DecimalFormat("0");

        System.out.println("Digite uma variável A que seja um número inteirol: ");
        a = sc.nextInt();

        System.out.println("Digite uma variável B que seja um número real: ");
        b = sc.nextDouble();
        sc.close();

        r1 = (2 * a) * (b / 2);

        r2 = (3 * a) + r1;

        r3 = r1 * r1 * r1;

        System.out.println("O produto do dobro de A mais a metade de B é: " + deci.format(r1));
        System.out.println("O triplo de A mais o resultado da primeira operação é: " + deci.format(r2));
        System.out.println("O cubo do resultado da primeira operação é: " + deci2.format(r3));
        JOptionPane.showMessageDialog(null,
                ("O produto do dobro de " + a + " mais a metade de " + b + " é: " + deci.format(r1)) + "\n"
                        + ("O triplo de " + a + " mais o resultado da primeira operação é: " + deci.format(r2)) + "\n"
                        + ("O cubo do resultado da primeira operação é: " + deci2.format(r3)));

    }
}
