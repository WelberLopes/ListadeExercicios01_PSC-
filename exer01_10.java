import java.util.*;

public class exer01_10 {
    public static void main(String[] args) throws Exception {

        double F;
        double C;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a temperatura em graus Celcius: ");
        C = sc.nextDouble();

        F = ((C * 1.8) + 32);
        System.out.print(Math.round(F));
        System.out.println("°F");

    }
}
