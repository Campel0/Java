import java.util.Scanner;

public class Exercicio3$17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do termo da sequência de Fibonacci desejado: ");
        int n = scanner.nextInt();

        int a = 0, b = 1, temp;
        if (n == 0) {
            System.out.println("Fibonacci de 0 e 1");
        } else {
            for (int i = 1; i < n; i++) {
                temp = a + b;
                a = b;
                b = temp;
            }
            System.out.println("Fibonacci de " + n + " e " + b);
        }

        scanner.close();
    }
}
