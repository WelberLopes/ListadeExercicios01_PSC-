import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.plaf.synth.SynthSeparatorUI;
import java.text.DecimalFormat;

public class exer01_12 {
    public static void main(String[] args) throws Exception {
        double altura;
        double pesoideal;

        Scanner sc = new Scanner(System.in);
        DecimalFormat deci = new DecimalFormat("0.0");

        System.out.println("Qual sua altura? ");
        altura = sc.nextDouble();

        pesoideal = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal seria: " + deci.format(pesoideal) + "kg");

    }
}
