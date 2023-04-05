import java.util.Scanner;
import java.text.DecimalFormat;

public class exer01_18 {
    public static void main(String[] args) throws Exception {
        DecimalFormat deci1 = new DecimalFormat("0.00");
        DecimalFormat deci = new DecimalFormat("0");
        Scanner sc = new Scanner(System.in);

        System.out.println("=================================================================");
        System.out.println("               CALCULADORA DE TEMPO PARA DOWNLOAD                ");
        System.out.println("=================================================================");

        System.out.println("Digite o tamanho do arquivo(Mb): ");
        double MB = sc.nextDouble();
        System.out.println("Digite a velocidade da sua internet(Mbps): ");
        double Mbps = sc.nextDouble();
        sc.close();

        double tempo_down = MB / Mbps;
        double tempo_aprox = tempo_down / 60;
        System.out.println("RESULTADO: ");

        if (tempo_aprox >= 1) {

            System.out.println(" O tempo estimado para download do arquivo informado será de: "
                    + deci.format(Math.round(tempo_aprox)) + " Minutos");
        } else {
            System.out.println(" O tempo estimado para download do arquivo informado será de: "
                    + (deci1.format(tempo_aprox)) + " Minutos.");
        }
        System.out.println("==================================================================");

    }
}
