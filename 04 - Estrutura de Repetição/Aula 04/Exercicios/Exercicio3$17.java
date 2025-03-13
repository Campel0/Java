// Obtenção de Termo Específico da Série de Fibonacci

import java.util.Scanner;

public class Exercicio3$17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do termo da sequência de Fibonacci desejado: ");
        int n = scanner.nextInt();

        int a = 1;
        int b = 1;
        int temp;

        if (n == 1) {
            System.out.println("Fibonacci de 1 e 1");
        }
        else{
            // fazemos o laço para buscar o termo e fazer a troca do b para o termo ideal
            for (int i = 2; i <= n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("Fibonacci de " + n + " e " + b);
        }

        scanner.close();
    }
}
