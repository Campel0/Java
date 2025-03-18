// Impressão de Gráfico de Barras com Validação de Entrada

import java.util.Scanner;

public class Exercicio3$22 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean invalido = false;
        int max = 0;

        // Ler os 5 números e verificar se são positivos
        for (int i = 0; i < 5; i++) {
            System.out.print("N" + (i + 1) + ": ");
            numeros[i] = scan.nextInt();
            if (numeros[i] <= 0) {
                invalido = true; // Marca como inválido se o número não for positivo
            }
            if (numeros[i] > max) {
                max = numeros[i]; // Encontrar o maior número para definir o topo do gráfico
            }
        }
        scan.close();

        // Se houver número negativo ou zero, exibir mensagem e encerrar
        if (invalido) {
            System.out.println("Forneca apenas numeros positivos.");
            return; // Encerra o programa se houver números inválidos
        }

        // Exibir o gráfico de barras
        for (int i = max; i > 0; i--) {
            System.out.printf("%04d  ", i); // Imprime o número formatado com 4 dígitos
            for (int j = 0; j < 5; j++) {
                if (numeros[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}