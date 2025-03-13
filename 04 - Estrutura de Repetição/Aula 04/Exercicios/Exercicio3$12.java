// Contagem de Números Pares em Intervalo

import java.util.Scanner;

public class Exercicio3$12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N1: ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        int n2 = Integer.parseInt(scan.nextLine());

        // Definindo os limites corretamente (ordem crescente)
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int contadorPares = 0; // Contador de numeros pares

        // Percorrer o intevalo e conta quantos pares tem
        for(int i = menor; i <= maior; i++){
            if(i % 2 == 0){
                contadorPares++; // incrementa a variável
            }
        }

        System.out.printf("\nNumeros pares entre %d e %d: %d", menor, maior, contadorPares);

        scan.close();

    }
}
