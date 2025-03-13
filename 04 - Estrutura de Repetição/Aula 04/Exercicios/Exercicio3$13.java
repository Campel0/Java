// Contagem de Múltiplos em Intervalo

import java.util.Scanner;

public class Exercicio3$13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N1: ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        int n2 = Integer.parseInt(scan.nextLine());

        // verifica o menor numero entre n1 e n2
        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        // as variaveis são iniciadas em 0
        int multiplicadorDeDois = 0;
        int multiplicadorDeTres = 0;
        int multiplicadorDeQuatro = 0;

        // percorre do menor ao maior numero digitado
        for(int i = menor; i <= maior; i++)
        {
            // se a divisão for exata ela entrara nessas variáveis e serão incrementadas
            if(i % 2 == 0) multiplicadorDeDois++;
            if(i % 3 == 0) multiplicadorDeTres++;
            if(i % 4 == 0) multiplicadorDeQuatro++;
        }

        System.out.printf("Multiplos de 2: %d\n", multiplicadorDeDois);
        System.out.printf("Multiplos de 3: %d\n", multiplicadorDeTres);
        System.out.printf("Multiplos de 4: %d", multiplicadorDeQuatro);

        scan.close();

    }
}
