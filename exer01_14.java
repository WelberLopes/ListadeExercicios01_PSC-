import java.util.*;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class exer01_14 {
    public static void main(String[] args) throws Exception {

        double peso, excessopeso;
        double multa;
        double limite = 50;
        DecimalFormat deci = new DecimalFormat("00.00");
        Scanner sc = new Scanner(System.in);

        System.out.println("=====================================================");
        System.out.println("    INSTITUTO DE PESCA DO ESTADO DE SÃO PAULO");
        System.out.println("=====================================================");

        System.out.println("Digite a quantidade de peixes em kilogramas: (##,##)");
        peso = sc.nextDouble();
        sc.close();

        excessopeso = (peso - limite);
        multa = excessopeso * 4;

        if (excessopeso > 0) {
            System.out.println("Você excedeu " + excessopeso
                    + "kg além dos 50kg permitidos para pesca e precisa pagar a multa no valor de: R$"
                    + deci.format(multa));
            JOptionPane.showMessageDialog(null, "Você excedeu " + excessopeso
                    + "kg além dos 50kg permitidos para pesca." + "\n" + "Precisa pagar a multa no valor de: R$"
                    + deci.format(multa),
                    "INSTITUTO DE PESCA DO ESTADO DE SÃO PAULO.", 2);

        } else {
            System.out.println("Você está dentro do limite(50KG) de pesca permitido e não precisará pagar multa!");
        }

    }
}
