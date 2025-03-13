// Impressão dos Primeiros Termos da Série de Fibonacci

public class Exercicio3$16 {
    public static void main(String[] args) {

        // inicialização das variaveis
        int termo = 20;
        long primeiro = 1;
        long segundo = 1;

        System.out.printf("%d %d ", primeiro, segundo);
        // loop para calcular a sequência
        for (int i = 2; i < termo; i++) {
            // calculo do proximo termo
            long proximo = primeiro + segundo;

            System.out.printf("%d ", proximo);

            // atualzia o termo
            primeiro = segundo;
            segundo = proximo;

        }

    }
}
