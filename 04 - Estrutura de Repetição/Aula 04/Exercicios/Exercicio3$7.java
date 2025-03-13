// Validação de Entrada e Impressão de Sequência Numérica Decrescente (Negativos)

import java.util.Scanner;

public class Exercicio3$7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        System.out.print("Forneca um numero menor ou igual a zero: ");
        numero = Integer.parseInt(scan.nextLine());

        if(numero > 0) // condição caso o numero digitado for maior que 0
        {
            System.out.println("Valor incorreto (positivo)");
        }
        else{
            // i será inicializado com o número negativo digitado, e ele ira diminuir até chegar em 0
            for(int i = numero; i <= 0; i++) // Dificuldade na primeira e segunda parte do laço aonde estava invertendo os operadores de comparação
            {
                System.out.printf("%d ", i);
            }
        }

        scan.close();

    }
}
