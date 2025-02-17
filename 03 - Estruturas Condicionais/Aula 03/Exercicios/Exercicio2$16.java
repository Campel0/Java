import java.util.Scanner;

public class Exercicio2$16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número entre 1 e 3999: ");
        int numero = Integer.parseInt(scan.nextLine());

        if (numero < 1 || numero > 3999) {
            System.out.println("NNumero incorreto!");
        } else {
            String romano = ""; // armazena os caracteres de acordo com o numero digitado para a letra romana

            // Milhares
            String[] milhares = {"", "M", "MM", "MMM"};
            // Centenas
            String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            // Dezenas
            String[] dezenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            // Unidades
            String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            // Concatena os valores correspondentes
            romano += milhares[numero / 1000];
            romano += centenas[(numero % 1000) / 100];
            romano += dezenas[(numero % 100) / 10];
            romano += unidades[numero % 10];

            System.out.printf("%d = %s%n", numero, romano);
        }

        scan.close(); // Fecha o Scanner
    }
}
