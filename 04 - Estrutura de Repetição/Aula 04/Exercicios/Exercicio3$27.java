import java.util.Scanner;

public class Exercicio3$27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double peso;
        double maiorPeso = 0; // Se nenhum peso for digitado, permanece 0.00
        double somaPesos60 = 0; // Soma dos pesos acima de 60kg
        int contador60 = 0; // Contador de pesos acima de 60kg
        int numeroPessoa = 1;

        while (true) {
            System.out.printf("Entre com o peso da pessoa %d: ", numeroPessoa);

            if (!scan.hasNextDouble()) { // Verifica se a entrada é um número válido
                System.out.println("Entrada invalida. Tente novamente.");
                scan.next(); // Descarta a entrada inválida
                continue;
            }

            peso = Double.parseDouble(scan.next());

            if (peso < 0) {
                break;
            }

            if (peso > maiorPeso) {
                maiorPeso = peso; // Atualiza a variável para o maior peso encontrado
            }

            if (peso > 60) {
                somaPesos60 += peso; // Soma dos pesos acima de 60kg
                contador60++; // Contador dos pesos acima de 60kg
            }
            numeroPessoa++; // Incrementa a contagem de pessoas
        }

        // Garante que sempre será impresso um valor formatado, mesmo sem entrada válida
        double media = (contador60 > 0) ? (somaPesos60 / contador60) : 0.00;

        System.out.printf("Media dos pesos acima de 60kg: %.2fkg\n", media);
        System.out.printf("A pessoa mais pesada possui %.2fkg\n", maiorPeso);

        scan.close();
    }
}
