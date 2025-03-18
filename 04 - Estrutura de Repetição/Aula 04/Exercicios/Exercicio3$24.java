// Contagem de Idades com Limites e Encerramento por Negativo

import java.util.Scanner;

public class Exercicio3$24 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Inicializa contadores para as idades
        int contadorMenor21 = 0; // contador para idade menor que 21
        int contadorMaior50 = 0; // contador para idade maior que 50

        int idade; // variável para armazenar a idade inserida
        int numeroPessoa = 1; // inicializa o contador de pessoa

        // inicia um loop infinito para solicitar as idades
        while (true){

            System.out.print("Idade da pessoa 0" + numeroPessoa + ": ");
            idade = Integer.parseInt(scan.nextLine());

            // verifica se a idade inserida é negativa
            if (idade < 0){
                break; // sai do loop se a idade for negativa
            }
            if (idade < 21){
                contadorMenor21++; // incrementa o contador
            }
            else if (idade > 50){
                contadorMaior50++; // incrementa o contador
            }

            numeroPessoa++; // incrementa o número de pessoa para a próxima interação
        }
        System.out.printf("Total de pessoas menores de 21 anos: %d\n", contadorMenor21);
        System.out.printf("Total de pessoas com mais de 50 anos: %d", contadorMaior50);

        scan.close();
    }

}
