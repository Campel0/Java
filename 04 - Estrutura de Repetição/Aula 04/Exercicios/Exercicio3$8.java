// Validação de Entrada e Impressão de Sequência Numérica Crescente (Negativos)

import java.util.Scanner;

public class Exercicio3$8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Forneca um numero menor ou igual a zero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero > 0){
            System.out.println("Valor incorreto (positivo)");
        }
        else{
            // loço irá começar em 0 e irá percorrer até o número negativo digitado
            // e até ele não ser igual ele ira sendo decrementado 
            for(int i = 0; i >= numero; i--) // Dificuldade no laço
            {
                System.out.printf("%d ", i);
            }
        }

        scan.close();

    }
}
