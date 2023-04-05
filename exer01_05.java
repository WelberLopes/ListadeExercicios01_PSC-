import java.util.*;
import javax.swing.*;

public class exer01_05 {
    public static void main(String[] args) throws Exception {

        int centimetros;
        int metros;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor em metros a ser convertido: ");
        metros = sc.nextInt();

        centimetros = metros * 100;

        System.out.println((metros) + " m " + " em centímetros é = " + (centimetros) + ("cm"));

        JOptionPane.showMessageDialog(null, (metros) + " m " + " em centímetros é = " + (centimetros) + ("cm"));

    }
}
