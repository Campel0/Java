// Cálculo de Somatório, Média e Quantidade de Números Decimais com Encerramento por Negativo

import java.util.Scanner;

public class Exercicio3$25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // inicialização da variáveis
        int valor;
        double somatorio = 0;
        int contador = 0;

        while (true){

            // entrada de dados
            System.out.print("Entre com um valor: ");
            valor = Integer.parseInt(scan.nextLine());

            if ( valor < 0) {
                break;
            }
            somatorio += valor; // cada vez que o loop passa aqui ele soma os valores digitados
            contador++; // incrementa toda vez que o loop passa
        }
        double media = (contador > 0) ? (somatorio / contador) : 0; // usamos os operadores ternários para não fazer if

        System.out.printf("Somatorio: %.2f\n", somatorio);
        System.out.printf("Media: %.2f\n", media);
        System.out.printf("Quantidade: %d", contador);

        scan.close();

        // fui na IA ver esse algoritmo de média pois toda vez estava somando o -1 quando eu queria sair do loop
        // operador ternário:
        // condição ? expressão_se_verdadeira : expressão_se_falsa
    }
}
