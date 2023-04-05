import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;
import java.lang.Math;

public class exer01_16 {
    public static void main(String[] args) throws Exception {
        double m2;
        double latas;

        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.00");

        System.out.println("Qual o tamanho em m2 a ser pintado? ");

        m2 = sc.nextDouble();

        latas = m2 / 6;

        double preço = latas * 80;

        System.out.println(
                "Vão ser necessárias " + (Math.round(latas)) + " latas " + "para pintar uma área de " + (m2) + "m2"
                        + " e custará um total de: R$" + deci.format(preço));
        JOptionPane.showMessageDialog(null,
                "Vão ser necessárias " + (Math.round(latas)) + " latas " + "para pintar uma área de " + (m2) + "m2"
                        + "\n" + " E custará um total de: R$" + deci.format(preço));

    }
}
