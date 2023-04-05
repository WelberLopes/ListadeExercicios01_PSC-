import java.text.DecimalFormat;
import java.util.Scanner;
import javax.swing.*;

public class exer01_15 {
    public static void main(String[] args) throws Exception {
        double salariobruto, a1, a2;
        double horas;
        double ganho;
        double liquido;
        double ir;
        double inss;
        double sind;

        DecimalFormat deci = new DecimalFormat("0.00");
        DecimalFormat deci1 = new DecimalFormat("0");
        Scanner sc = new Scanner(System.in);

        System.out.println("-------------------------------------------------");
        System.out.println(" CALCULO DE DESCONTOS SOBRE VENCIMENTOS");
        System.out.println("-------------------------------------------------");

        System.out.println("Quanto você ganha por hora trabalhada? ");
        ganho = sc.nextFloat();
        System.out.println("Quantas horas trabalha por mês? ");
        horas = sc.nextFloat();

        salariobruto = ganho * horas;

        inss = salariobruto * 0.08;

        a1 = salariobruto - inss;

        ir = a1 * 0.11;

        a2 = a1 - ir;

        sind = a2 * 0.05;

        liquido = salariobruto - (inss + ir + sind);
        System.out.println();
        System.out.println("------------------RESULTADO----------------------");
        System.out.println("-------------------------------------------------");
        System.out.println("Horas trabalhadas: " + deci1.format(horas));
        System.out.println("Ganho por hora   : R$" + deci.format(ganho));
        System.out.println("-------------------------------------------------");
        System.out.println("CALCULO:");
        System.out.println("+ Salário Bruto     : R$" + deci.format(salariobruto));
        System.out.println("- IR           (11%): R$" + deci.format(ir));
        System.out.println("- INSS         ( 8%): R$" + deci.format(inss));
        System.out.println("- Sindicato    ( 5%): R$" + deci.format(sind));
        System.out.println("= Salário Liquido   : R$" + deci.format(liquido));

        System.out.println("-------------------------------------------------");

    }
}
