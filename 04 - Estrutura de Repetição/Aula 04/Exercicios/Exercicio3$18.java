// Impressão de Padrão com Loop For

public class Exercicio3$18 {
    public static void main(String[] args) {

        // esse laço controla os números de linhas
        for (int i = 1; i <= 5; i++) {
            // esse laço controla o número de asteriscos quando i for 1 será impresso um asterisco...
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}