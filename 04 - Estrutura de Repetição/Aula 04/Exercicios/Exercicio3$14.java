import java.util.Scanner;

public class Exercicio3$14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N1: ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        int n2 = Integer.parseInt(scan.nextLine());

        int menor = Math.min(n1, n2);
        int maior = Math.max(n1, n2);

        int soma = 0;

        for(int i = menor; i <= maior; i++)
        {
            soma += i;
        }

        System.out.printf("Somatorio entre %d e %d: %d", menor, maior, soma);

        scan.close();

    }
}
