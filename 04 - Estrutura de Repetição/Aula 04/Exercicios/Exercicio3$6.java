// Validação de Entrada e Impressão de Sequência Numérica Decrescente

import java.util.Scanner;

public class Exercicio3$6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Forneca um numero maior ou igual a zero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero < 0) // condição para caso o número digitado for menor que 0
        {
            System.out.println("Valor incorreto (negativo)");
        }
        else{
            // laço para fazer o número digitado ser decrescente
            for(int i = numero; i >= 0; i--)
            {
                System.out.printf("%d ", i);
            }
        }

        scan.close();

    }
}
