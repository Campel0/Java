// Encontrando o Maior e o Menor Número Inteiro com Encerramento por Negativo

import java.util.Scanner;

public class Exercicio3$26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;
        int maior = 0;
        int menor = 0;

        boolean entrou = false; // verifica se houve entrada válida

        while (true) {
            System.out.print("Entre com um valor: ");
            valor = scan.nextInt();

            if (valor < 0){
                break;
            }

            if(!entrou){
                menor = valor; // se for o primeiro número válido, inicia com ele
                maior = valor;
                entrou = true;
            }

            // Atualiza o menor e maior valores
            if (valor < menor){
                menor = valor; // atualiza com o maior valor digitado
            }
            if (valor > maior){
                maior = valor; // atualiza com o menor valor digitado
            }
        }

        System.out.printf("Menor numero: %d\n", menor);
        System.out.printf("Maior numero: %d\n", maior);

        scan.close();

        // menor Integer.MAX_VALUE, que é o maior valor possível para um inteiro.
        // Isso garante que qualquer valor digitado pelo usuário será menor que esse valor inicial.
        
        // maior Integer.MIN_VALUE, que é o menor valor possível para um inteiro.
        // Isso garante que qualquer valor digitado pelo usuário será maior que esse valor inicial.
    }
}
