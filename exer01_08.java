import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        float ganho;
        float hora;
        float salario;

        // Passo 1: fazer a entrada de dados;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu ganho por hora?");
        ganho = teclado.nextFloat();
        System.out.println("Quantas horas trabalhadas");
        hora = teclado.nextFloat();
        // Passo 2: calculO
        salario = ganho * hora;
        // Passo 3: exibir resultado:
        System.out.print("Seu salário neste mês é de: R$");
        System.out.print(salario);
    }
}