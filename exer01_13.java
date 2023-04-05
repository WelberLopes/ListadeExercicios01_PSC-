import java.util.Scanner;

import javax.swing.JOptionPane;

import java.text.DecimalFormat;

import org.w3c.dom.Text;

public class exer01_13 {
    public static void main(String[] args) throws Exception {

        double h, h1, h2;
        String sexo;
        DecimalFormat deci = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua altura? ");
        h = sc.nextDouble();

        System.out.println("Qual seu gênero?(Use M para masculino e F para feminino)");
        sexo = sc.next();

        // altura para homens:
        h1 = (72.7 * h) - 58;
        // altura para mulheres:
        h2 = (62.1 * h) - 44.7;

        if (sexo.equals("M")) {
            System.out.println(" Seu peso ideal é: " + deci.format(h1) + "kg");
            JOptionPane.showMessageDialog(null, " Seu peso ideal é: " + deci.format(h1) + "kg");
        } else {

            System.out.println(" Seu peso ideal é: " + deci.format(h2) + "kg");
            JOptionPane.showMessageDialog(null, " Seu peso ideal é: " + deci.format(h2) + "kg");

        }

    }
}
