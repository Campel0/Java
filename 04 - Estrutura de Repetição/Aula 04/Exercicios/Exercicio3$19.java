public class Exercicio3$19 {
    public static void main(String[] args) {

        // Parte Crescente
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Parte Decrescente
        // controla o número de linhas que sera impressa
        for (int i = 4; i >= 1; i--) {
            // o número de asterisco sera de acordo com o valor de i mas de forma decrescente
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
