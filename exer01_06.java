import java.util.*;

import javax.print.attribute.standard.JobPriority;
import javax.swing.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class exer01_06 {
    public static void main(String[] args) throws Exception {
        double raio;
        double area;
        double PI = 3.14;

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o raio do cículo? ");
        raio = sc.nextDouble();
        area = PI * (raio * raio);
        String resultado = df.format(area);
        System.out.printf("A área do circulo é: " + (resultado) + "m2");

    }
}
