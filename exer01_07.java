import java.util.Scanner;

public class exer01_07 {
    public static void main(String[] args) throws Exception {

        int L;
        int dobro;
        int area;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor de um dos lados: ");
        L = sc.nextInt();

        area = L * L;

        dobro = area * 2;

        System.out.println("A área do quadrado é: " + area + "cm2");
        System.out.println("O dobro da área é: " + dobro + "cm");

    }
}
