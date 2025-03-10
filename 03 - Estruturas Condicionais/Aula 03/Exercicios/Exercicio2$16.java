import java.util.Scanner;

public class Exercicio2$16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um número entre 1 e 3999: ");
        int numero = Integer.parseInt(scan.nextLine());

        // se o numero for menor que 1 ou maior que 3999 ele ira executar
        if (numero < 1 || numero > 3999) {
            System.out.println("NNumero incorreto!");
        } else {
            String romano = ""; // armazena os caracteres de acordo com o numero digitado para a letra romana

            // Milhares para numeros de mil em mil
            String[] milhares = {"", "M", "MM", "MMM"};
            // Centenas para numeros de cem em cem
            String[] centenas = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
            // Dezenas para numeros de dez em dez
            String[] dezenas = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
            // Unidades para cada unidade
            String[] unidades = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

            // Concatena os valores correspondentes com +=
            // += é usado para adicionar um valor a uma variável e atualizar seu resultado
            // Obtém a parte dos milhares e adiciona à string romano
            romano += milhares[numero / 1000];

            // Obtém a parte das centenas e adiciona à string romano
            romano += centenas[(numero % 1000) / 100];

            // Obtém a parte das dezenas e adiciona à string romano
            romano += dezenas[(numero % 100) / 10];

            // Obtém a parte das unidades e adiciona à string romano
            romano += unidades[numero % 10];

            System.out.printf("%d = %s%n", numero, romano);
        }

        scan.close(); // Fecha o Scanner
    }
}
