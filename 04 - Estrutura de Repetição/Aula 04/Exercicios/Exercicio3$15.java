import java.util.Scanner;

public class Exercicio3$15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Numero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero < 0)
        {
            System.out.print("Nao ha fatorial de numero negativo.");
        }
        else{
            long fatorial = 1;

            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }
            System.out.print(numero + "! = " + fatorial);
        }

        scan.close();

    }
}
