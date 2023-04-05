import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

import java.text.DecimalFormat;
import java.lang.Math;

public class exer01_17 {
        public static void main(String[] args) throws Exception {
                double m2;
                double latas;
                double galoes;

                Scanner sc = new Scanner(System.in);
                DecimalFormat deci = new DecimalFormat("0.00");
                DecimalFormat deci1 = new DecimalFormat("0.0");

                System.out.println("Qual o tamanho em m2 a ser pintado? ");

                m2 = sc.nextDouble();

                double litro = m2 / 6;
                latas = litro / 18;
                galoes = litro / 3.6;

                double preco_galao = (Math.round(galoes)) * 25;
                double preco_lata = (Math.round(latas)) * 80;
                System.out.println(
                                "=========================================================================================");

                System.out.println(
                                "                        LOJA DE TINTAS ALMEIDA                                           ");

                System.out.println(
                                "=========================================================================================");
                System.out.println("Para compras somente em latas de 18L:");
                System.out.println("\n");

                System.out.println("Serão necessárias " + (Math.round(latas)) + " latas " + "para pintar uma área de "
                                + deci1.format(m2) + "m2"
                                + " e custará um total de: R$" + deci.format(preco_lata));
                System.out.println(
                                "=========================================================================================");
                System.out.println("Para compras somente em galões de 3,6L:");
                System.out.println("\n");

                System.out.println("Serão necessários " + (Math.round(galoes)) + " galões "
                                + "para pintar uma área de " + deci1.format(m2) + "m2"
                                + " e custará um total de: R$" + deci.format(preco_galao));
                System.out.println(
                                "=========================================================================================");
                System.out.println("Para compras em latas e galões:");
                System.out.println("\n");
                double litros_folga = litro * 1.10;
                double latas_mix = litros_folga / 18.0;

                double litros_f_faltando = litros_folga - litro;
                double qtd_galoes = Math.ceil(litros_f_faltando / 3.6);

                double total_mix = ((Math.floor(latas_mix)) * 80) + ((Math.round(qtd_galoes)) * 25);

                System.out.println("Serão necessários " + Math.round(latas_mix) + " latas e "
                                + Math.round(qtd_galoes)
                                + " galões, que custarão: R$" + deci.format(total_mix));

        }
}
