// Cálculo do Fatorial de um Número Positivo

import java.util.Scanner;

public class Exercicio3$15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero < 0) // para números negativos
        {
            System.out.print("Nao ha fatorial de numero negativo.");
        }
        else{
            long fatorial = 1; // inicializa em 1

            for (int i = 1; i <= numero; i++) {
                fatorial *= i; // fatorial irá ser multiplicado até o número inserido
            }
            System.out.print(numero + "! = " + fatorial);
        }

        scan.close();

    }
}
