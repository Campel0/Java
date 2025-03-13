// Impressão da Tabuada

import java.util.Scanner;

public class Exercicio3$9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Tabuada do Numero: ");
        int numero = Integer.parseInt(scan.nextLine());

        for(int i = 0; i <= 10; i++) // Tive dificuldade no teste do for colocava ( i >=10) mas o correto é ( i <=10)
        {
            int tabuada = numero * i;
            System.out.printf("%d x %d = %d\n", numero, i, tabuada);
        }

        scan.close();

    }
}
