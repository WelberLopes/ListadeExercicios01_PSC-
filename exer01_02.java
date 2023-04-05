import java.util.Scanner;

import javax.swing.*;

class exer01_02 {
  public static void main(String[] args) {
    // Declaração de variáveis:
    int numero;
    // Injeção de dados:
    Scanner teclado = new Scanner(System.in);

    System.out.println("Informe um número");
    numero = teclado.nextInt();

    System.out.print("O número informado foi: ");
    System.out.print(numero);
    JOptionPane.showMessageDialog(null, "O número informado foi: " + (numero));
  }

}